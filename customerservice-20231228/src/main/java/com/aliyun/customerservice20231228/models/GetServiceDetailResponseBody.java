// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class GetServiceDetailResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetServiceDetailResponseBodyData data;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static GetServiceDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceDetailResponseBody self = new GetServiceDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetServiceDetailResponseBody setData(GetServiceDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServiceDetailResponseBodyData getData() {
        return this.data;
    }

    public GetServiceDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetServiceDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetServiceDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetServiceDetailResponseBodyDataAppointments extends TeaModel {
        @NameInMap("huhangId")
        public Long huhangId;

        @NameInMap("purchaseCode")
        public Integer purchaseCode;

        @NameInMap("purchaseDesc")
        public String purchaseDesc;

        @NameInMap("supportDays")
        public Integer supportDays;

        @NameInMap("travelDays")
        public Integer travelDays;

        public static GetServiceDetailResponseBodyDataAppointments build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataAppointments self = new GetServiceDetailResponseBodyDataAppointments();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataAppointments setHuhangId(Long huhangId) {
            this.huhangId = huhangId;
            return this;
        }
        public Long getHuhangId() {
            return this.huhangId;
        }

        public GetServiceDetailResponseBodyDataAppointments setPurchaseCode(Integer purchaseCode) {
            this.purchaseCode = purchaseCode;
            return this;
        }
        public Integer getPurchaseCode() {
            return this.purchaseCode;
        }

        public GetServiceDetailResponseBodyDataAppointments setPurchaseDesc(String purchaseDesc) {
            this.purchaseDesc = purchaseDesc;
            return this;
        }
        public String getPurchaseDesc() {
            return this.purchaseDesc;
        }

        public GetServiceDetailResponseBodyDataAppointments setSupportDays(Integer supportDays) {
            this.supportDays = supportDays;
            return this;
        }
        public Integer getSupportDays() {
            return this.supportDays;
        }

        public GetServiceDetailResponseBodyDataAppointments setTravelDays(Integer travelDays) {
            this.travelDays = travelDays;
            return this;
        }
        public Integer getTravelDays() {
            return this.travelDays;
        }

    }

    public static class GetServiceDetailResponseBodyDataPayOrders extends TeaModel {
        @NameInMap("amount")
        public String amount;

        @NameInMap("compassCommodityCode")
        public String compassCommodityCode;

        @NameInMap("compassCommodityName")
        public String compassCommodityName;

        @NameInMap("creatorEmpId")
        public String creatorEmpId;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("modifierEmpId")
        public String modifierEmpId;

        @NameInMap("operate")
        public java.util.Map<String, ?> operate;

        @NameInMap("orderDetail")
        public Object orderDetail;

        @NameInMap("orderId")
        public Long orderId;

        @NameInMap("originalPrice")
        public Double originalPrice;

        @NameInMap("payAmount")
        public Double payAmount;

        @NameInMap("payTime")
        public String payTime;

        @NameInMap("productName")
        public String productName;

        @NameInMap("reneWalUrl")
        public String reneWalUrl;

        @NameInMap("serviceContentMap")
        public java.util.Map<String, ?> serviceContentMap;

        @NameInMap("status")
        public Integer status;

        @NameInMap("statusStr")
        public String statusStr;

        @NameInMap("supportDays")
        public Integer supportDays;

        @NameInMap("uid")
        public String uid;

        @NameInMap("url")
        public String url;

        public static GetServiceDetailResponseBodyDataPayOrders build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataPayOrders self = new GetServiceDetailResponseBodyDataPayOrders();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataPayOrders setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public GetServiceDetailResponseBodyDataPayOrders setCompassCommodityCode(String compassCommodityCode) {
            this.compassCommodityCode = compassCommodityCode;
            return this;
        }
        public String getCompassCommodityCode() {
            return this.compassCommodityCode;
        }

        public GetServiceDetailResponseBodyDataPayOrders setCompassCommodityName(String compassCommodityName) {
            this.compassCommodityName = compassCommodityName;
            return this;
        }
        public String getCompassCommodityName() {
            return this.compassCommodityName;
        }

        public GetServiceDetailResponseBodyDataPayOrders setCreatorEmpId(String creatorEmpId) {
            this.creatorEmpId = creatorEmpId;
            return this;
        }
        public String getCreatorEmpId() {
            return this.creatorEmpId;
        }

        public GetServiceDetailResponseBodyDataPayOrders setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetServiceDetailResponseBodyDataPayOrders setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetServiceDetailResponseBodyDataPayOrders setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetServiceDetailResponseBodyDataPayOrders setModifierEmpId(String modifierEmpId) {
            this.modifierEmpId = modifierEmpId;
            return this;
        }
        public String getModifierEmpId() {
            return this.modifierEmpId;
        }

        public GetServiceDetailResponseBodyDataPayOrders setOperate(java.util.Map<String, ?> operate) {
            this.operate = operate;
            return this;
        }
        public java.util.Map<String, ?> getOperate() {
            return this.operate;
        }

        public GetServiceDetailResponseBodyDataPayOrders setOrderDetail(Object orderDetail) {
            this.orderDetail = orderDetail;
            return this;
        }
        public Object getOrderDetail() {
            return this.orderDetail;
        }

        public GetServiceDetailResponseBodyDataPayOrders setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public GetServiceDetailResponseBodyDataPayOrders setOriginalPrice(Double originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Double getOriginalPrice() {
            return this.originalPrice;
        }

        public GetServiceDetailResponseBodyDataPayOrders setPayAmount(Double payAmount) {
            this.payAmount = payAmount;
            return this;
        }
        public Double getPayAmount() {
            return this.payAmount;
        }

        public GetServiceDetailResponseBodyDataPayOrders setPayTime(String payTime) {
            this.payTime = payTime;
            return this;
        }
        public String getPayTime() {
            return this.payTime;
        }

        public GetServiceDetailResponseBodyDataPayOrders setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetServiceDetailResponseBodyDataPayOrders setReneWalUrl(String reneWalUrl) {
            this.reneWalUrl = reneWalUrl;
            return this;
        }
        public String getReneWalUrl() {
            return this.reneWalUrl;
        }

        public GetServiceDetailResponseBodyDataPayOrders setServiceContentMap(java.util.Map<String, ?> serviceContentMap) {
            this.serviceContentMap = serviceContentMap;
            return this;
        }
        public java.util.Map<String, ?> getServiceContentMap() {
            return this.serviceContentMap;
        }

        public GetServiceDetailResponseBodyDataPayOrders setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetServiceDetailResponseBodyDataPayOrders setStatusStr(String statusStr) {
            this.statusStr = statusStr;
            return this;
        }
        public String getStatusStr() {
            return this.statusStr;
        }

        public GetServiceDetailResponseBodyDataPayOrders setSupportDays(Integer supportDays) {
            this.supportDays = supportDays;
            return this;
        }
        public Integer getSupportDays() {
            return this.supportDays;
        }

        public GetServiceDetailResponseBodyDataPayOrders setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetServiceDetailResponseBodyDataPayOrders setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetServiceDetailResponseBodyDataPerformanceOrdersApplyFileVOList extends TeaModel {
        @NameInMap("appointmentId")
        public String appointmentId;

        @NameInMap("batchGroup")
        public String batchGroup;

        @NameInMap("customerId")
        public String customerId;

        @NameInMap("fileName")
        public String fileName;

        @NameInMap("fileType")
        public Integer fileType;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("remarke")
        public String remarke;

        @NameInMap("serviceApplyId")
        public Long serviceApplyId;

        @NameInMap("status")
        public Integer status;

        @NameInMap("url")
        public String url;

        public static GetServiceDetailResponseBodyDataPerformanceOrdersApplyFileVOList build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataPerformanceOrdersApplyFileVOList self = new GetServiceDetailResponseBodyDataPerformanceOrdersApplyFileVOList();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersApplyFileVOList setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersApplyFileVOList setBatchGroup(String batchGroup) {
            this.batchGroup = batchGroup;
            return this;
        }
        public String getBatchGroup() {
            return this.batchGroup;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersApplyFileVOList setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersApplyFileVOList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersApplyFileVOList setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersApplyFileVOList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersApplyFileVOList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersApplyFileVOList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersApplyFileVOList setRemarke(String remarke) {
            this.remarke = remarke;
            return this;
        }
        public String getRemarke() {
            return this.remarke;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersApplyFileVOList setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersApplyFileVOList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersApplyFileVOList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetServiceDetailResponseBodyDataPerformanceOrdersExtList extends TeaModel {
        @NameInMap("keyCode")
        public String keyCode;

        @NameInMap("name")
        public String name;

        @NameInMap("value")
        public Object value;

        @NameInMap("view")
        public String view;

        public static GetServiceDetailResponseBodyDataPerformanceOrdersExtList build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataPerformanceOrdersExtList self = new GetServiceDetailResponseBodyDataPerformanceOrdersExtList();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersExtList setKeyCode(String keyCode) {
            this.keyCode = keyCode;
            return this;
        }
        public String getKeyCode() {
            return this.keyCode;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersExtList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersExtList setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersExtList setView(String view) {
            this.view = view;
            return this;
        }
        public String getView() {
            return this.view;
        }

    }

    public static class GetServiceDetailResponseBodyDataPerformanceOrdersPerformanceNodeDTOS extends TeaModel {
        @NameInMap("display")
        public Boolean display;

        @NameInMap("extendInfo")
        public Object extendInfo;

        @NameInMap("index")
        public Integer index;

        @NameInMap("nodeName")
        public String nodeName;

        @NameInMap("status")
        public Integer status;

        public static GetServiceDetailResponseBodyDataPerformanceOrdersPerformanceNodeDTOS build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataPerformanceOrdersPerformanceNodeDTOS self = new GetServiceDetailResponseBodyDataPerformanceOrdersPerformanceNodeDTOS();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformanceNodeDTOS setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformanceNodeDTOS setExtendInfo(Object extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public Object getExtendInfo() {
            return this.extendInfo;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformanceNodeDTOS setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformanceNodeDTOS setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformanceNodeDTOS setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksApplyFileVOList extends TeaModel {
        @NameInMap("appointmentId")
        public String appointmentId;

        @NameInMap("batchGroup")
        public String batchGroup;

        @NameInMap("customerId")
        public String customerId;

        @NameInMap("fileName")
        public String fileName;

        @NameInMap("fileType")
        public Integer fileType;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("remarke")
        public String remarke;

        @NameInMap("serviceApplyId")
        public Long serviceApplyId;

        @NameInMap("status")
        public Integer status;

        @NameInMap("url")
        public String url;

        public static GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksApplyFileVOList build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksApplyFileVOList self = new GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksApplyFileVOList();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksApplyFileVOList setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksApplyFileVOList setBatchGroup(String batchGroup) {
            this.batchGroup = batchGroup;
            return this;
        }
        public String getBatchGroup() {
            return this.batchGroup;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksApplyFileVOList setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksApplyFileVOList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksApplyFileVOList setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksApplyFileVOList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksApplyFileVOList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksApplyFileVOList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksApplyFileVOList setRemarke(String remarke) {
            this.remarke = remarke;
            return this;
        }
        public String getRemarke() {
            return this.remarke;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksApplyFileVOList setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksApplyFileVOList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksApplyFileVOList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksExtList extends TeaModel {
        @NameInMap("keyCode")
        public String keyCode;

        @NameInMap("name")
        public String name;

        @NameInMap("value")
        public Object value;

        @NameInMap("view")
        public String view;

        public static GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksExtList build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksExtList self = new GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksExtList();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksExtList setKeyCode(String keyCode) {
            this.keyCode = keyCode;
            return this;
        }
        public String getKeyCode() {
            return this.keyCode;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksExtList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksExtList setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksExtList setView(String view) {
            this.view = view;
            return this;
        }
        public String getView() {
            return this.view;
        }

    }

    public static class GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksPerformanceNodeDTOS extends TeaModel {
        @NameInMap("display")
        public Boolean display;

        @NameInMap("extendInfo")
        public Object extendInfo;

        @NameInMap("index")
        public Integer index;

        @NameInMap("nodeName")
        public String nodeName;

        @NameInMap("status")
        public Integer status;

        public static GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksPerformanceNodeDTOS build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksPerformanceNodeDTOS self = new GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksPerformanceNodeDTOS();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksPerformanceNodeDTOS setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksPerformanceNodeDTOS setExtendInfo(Object extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public Object getExtendInfo() {
            return this.extendInfo;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksPerformanceNodeDTOS setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksPerformanceNodeDTOS setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksPerformanceNodeDTOS setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceMonthReports extends TeaModel {
        @NameInMap("appointmentId")
        public String appointmentId;

        @NameInMap("batchGroup")
        public String batchGroup;

        @NameInMap("customerId")
        public String customerId;

        @NameInMap("fileName")
        public String fileName;

        @NameInMap("fileType")
        public Integer fileType;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("remarke")
        public String remarke;

        @NameInMap("serviceApplyId")
        public Long serviceApplyId;

        @NameInMap("status")
        public Integer status;

        @NameInMap("url")
        public String url;

        public static GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceMonthReports build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceMonthReports self = new GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceMonthReports();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceMonthReports setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceMonthReports setBatchGroup(String batchGroup) {
            this.batchGroup = batchGroup;
            return this;
        }
        public String getBatchGroup() {
            return this.batchGroup;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceMonthReports setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceMonthReports setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceMonthReports setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceMonthReports setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceMonthReports setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceMonthReports setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceMonthReports setRemarke(String remarke) {
            this.remarke = remarke;
            return this;
        }
        public String getRemarke() {
            return this.remarke;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceMonthReports setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceMonthReports setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceMonthReports setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceReports extends TeaModel {
        @NameInMap("appointmentId")
        public String appointmentId;

        @NameInMap("batchGroup")
        public String batchGroup;

        @NameInMap("customerId")
        public String customerId;

        @NameInMap("fileName")
        public String fileName;

        @NameInMap("fileType")
        public Integer fileType;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("remarke")
        public String remarke;

        @NameInMap("serviceApplyId")
        public Long serviceApplyId;

        @NameInMap("status")
        public Integer status;

        @NameInMap("url")
        public String url;

        public static GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceReports build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceReports self = new GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceReports();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceReports setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceReports setBatchGroup(String batchGroup) {
            this.batchGroup = batchGroup;
            return this;
        }
        public String getBatchGroup() {
            return this.batchGroup;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceReports setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceReports setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceReports setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceReports setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceReports setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceReports setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceReports setRemarke(String remarke) {
            this.remarke = remarke;
            return this;
        }
        public String getRemarke() {
            return this.remarke;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceReports setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceReports setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceReports setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceSchemes extends TeaModel {
        @NameInMap("appointmentId")
        public String appointmentId;

        @NameInMap("batchGroup")
        public String batchGroup;

        @NameInMap("customerId")
        public String customerId;

        @NameInMap("fileName")
        public String fileName;

        @NameInMap("fileType")
        public Integer fileType;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("remarke")
        public String remarke;

        @NameInMap("serviceApplyId")
        public Long serviceApplyId;

        @NameInMap("status")
        public Integer status;

        @NameInMap("url")
        public String url;

        public static GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceSchemes build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceSchemes self = new GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceSchemes();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceSchemes setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceSchemes setBatchGroup(String batchGroup) {
            this.batchGroup = batchGroup;
            return this;
        }
        public String getBatchGroup() {
            return this.batchGroup;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceSchemes setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceSchemes setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceSchemes setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceSchemes setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceSchemes setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceSchemes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceSchemes setRemarke(String remarke) {
            this.remarke = remarke;
            return this;
        }
        public String getRemarke() {
            return this.remarke;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceSchemes setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceSchemes setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceSchemes setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksTamEngineers extends TeaModel {
        @NameInMap("creatorEmpId")
        public String creatorEmpId;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("hrStatus")
        public String hrStatus;

        @NameInMap("id")
        public Long id;

        @NameInMap("lastName")
        public String lastName;

        @NameInMap("modifierEmpId")
        public String modifierEmpId;

        @NameInMap("name")
        public String name;

        @NameInMap("nickNameEn")
        public String nickNameEn;

        @NameInMap("realmId")
        public Long realmId;

        @NameInMap("workid")
        public String workid;

        public static GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksTamEngineers build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksTamEngineers self = new GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksTamEngineers();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksTamEngineers setCreatorEmpId(String creatorEmpId) {
            this.creatorEmpId = creatorEmpId;
            return this;
        }
        public String getCreatorEmpId() {
            return this.creatorEmpId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksTamEngineers setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksTamEngineers setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksTamEngineers setHrStatus(String hrStatus) {
            this.hrStatus = hrStatus;
            return this;
        }
        public String getHrStatus() {
            return this.hrStatus;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksTamEngineers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksTamEngineers setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksTamEngineers setModifierEmpId(String modifierEmpId) {
            this.modifierEmpId = modifierEmpId;
            return this;
        }
        public String getModifierEmpId() {
            return this.modifierEmpId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksTamEngineers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksTamEngineers setNickNameEn(String nickNameEn) {
            this.nickNameEn = nickNameEn;
            return this;
        }
        public String getNickNameEn() {
            return this.nickNameEn;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksTamEngineers setRealmId(Long realmId) {
            this.realmId = realmId;
            return this;
        }
        public Long getRealmId() {
            return this.realmId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksTamEngineers setWorkid(String workid) {
            this.workid = workid;
            return this;
        }
        public String getWorkid() {
            return this.workid;
        }

    }

    public static class GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks extends TeaModel {
        @NameInMap("applyFileVOList")
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksApplyFileVOList> applyFileVOList;

        @NameInMap("appointmentCode")
        public String appointmentCode;

        @NameInMap("appointmentEndTime")
        public Long appointmentEndTime;

        @NameInMap("appointmentId")
        public String appointmentId;

        @NameInMap("appointmentPassTime")
        public Long appointmentPassTime;

        @NameInMap("appointmentTime")
        public Long appointmentTime;

        @NameInMap("commodityDesc")
        public String commodityDesc;

        @NameInMap("creatorEmpId")
        public String creatorEmpId;

        @NameInMap("cycleService")
        public Boolean cycleService;

        @NameInMap("extList")
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksExtList> extList;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("mergeSolutionAndReporterOneStep")
        public Boolean mergeSolutionAndReporterOneStep;

        @NameInMap("modifierEmpId")
        public String modifierEmpId;

        @NameInMap("orderDetail")
        public Object orderDetail;

        @NameInMap("orderId")
        public Long orderId;

        @NameInMap("performanceNodeDTOS")
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksPerformanceNodeDTOS> performanceNodeDTOS;

        @NameInMap("purchasePackCode")
        public Integer purchasePackCode;

        @NameInMap("serviceApplyId")
        public Long serviceApplyId;

        @NameInMap("serviceMonthReports")
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceMonthReports> serviceMonthReports;

        @NameInMap("serviceReports")
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceReports> serviceReports;

        @NameInMap("serviceSchemes")
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceSchemes> serviceSchemes;

        @NameInMap("status")
        public Integer status;

        @NameInMap("statusStr")
        public String statusStr;

        @NameInMap("supportTime")
        public java.util.List<Long> supportTime;

        @NameInMap("tamEngineers")
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksTamEngineers> tamEngineers;

        public static GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks self = new GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks setApplyFileVOList(java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksApplyFileVOList> applyFileVOList) {
            this.applyFileVOList = applyFileVOList;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksApplyFileVOList> getApplyFileVOList() {
            return this.applyFileVOList;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks setAppointmentCode(String appointmentCode) {
            this.appointmentCode = appointmentCode;
            return this;
        }
        public String getAppointmentCode() {
            return this.appointmentCode;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks setAppointmentEndTime(Long appointmentEndTime) {
            this.appointmentEndTime = appointmentEndTime;
            return this;
        }
        public Long getAppointmentEndTime() {
            return this.appointmentEndTime;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks setAppointmentPassTime(Long appointmentPassTime) {
            this.appointmentPassTime = appointmentPassTime;
            return this;
        }
        public Long getAppointmentPassTime() {
            return this.appointmentPassTime;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks setAppointmentTime(Long appointmentTime) {
            this.appointmentTime = appointmentTime;
            return this;
        }
        public Long getAppointmentTime() {
            return this.appointmentTime;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks setCommodityDesc(String commodityDesc) {
            this.commodityDesc = commodityDesc;
            return this;
        }
        public String getCommodityDesc() {
            return this.commodityDesc;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks setCreatorEmpId(String creatorEmpId) {
            this.creatorEmpId = creatorEmpId;
            return this;
        }
        public String getCreatorEmpId() {
            return this.creatorEmpId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks setCycleService(Boolean cycleService) {
            this.cycleService = cycleService;
            return this;
        }
        public Boolean getCycleService() {
            return this.cycleService;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks setExtList(java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksExtList> extList) {
            this.extList = extList;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksExtList> getExtList() {
            return this.extList;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks setMergeSolutionAndReporterOneStep(Boolean mergeSolutionAndReporterOneStep) {
            this.mergeSolutionAndReporterOneStep = mergeSolutionAndReporterOneStep;
            return this;
        }
        public Boolean getMergeSolutionAndReporterOneStep() {
            return this.mergeSolutionAndReporterOneStep;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks setModifierEmpId(String modifierEmpId) {
            this.modifierEmpId = modifierEmpId;
            return this;
        }
        public String getModifierEmpId() {
            return this.modifierEmpId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks setOrderDetail(Object orderDetail) {
            this.orderDetail = orderDetail;
            return this;
        }
        public Object getOrderDetail() {
            return this.orderDetail;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks setPerformanceNodeDTOS(java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksPerformanceNodeDTOS> performanceNodeDTOS) {
            this.performanceNodeDTOS = performanceNodeDTOS;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksPerformanceNodeDTOS> getPerformanceNodeDTOS() {
            return this.performanceNodeDTOS;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks setPurchasePackCode(Integer purchasePackCode) {
            this.purchasePackCode = purchasePackCode;
            return this;
        }
        public Integer getPurchasePackCode() {
            return this.purchasePackCode;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks setServiceMonthReports(java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceMonthReports> serviceMonthReports) {
            this.serviceMonthReports = serviceMonthReports;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceMonthReports> getServiceMonthReports() {
            return this.serviceMonthReports;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks setServiceReports(java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceReports> serviceReports) {
            this.serviceReports = serviceReports;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceReports> getServiceReports() {
            return this.serviceReports;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks setServiceSchemes(java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceSchemes> serviceSchemes) {
            this.serviceSchemes = serviceSchemes;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksServiceSchemes> getServiceSchemes() {
            return this.serviceSchemes;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks setStatusStr(String statusStr) {
            this.statusStr = statusStr;
            return this;
        }
        public String getStatusStr() {
            return this.statusStr;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks setSupportTime(java.util.List<Long> supportTime) {
            this.supportTime = supportTime;
            return this;
        }
        public java.util.List<Long> getSupportTime() {
            return this.supportTime;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks setTamEngineers(java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksTamEngineers> tamEngineers) {
            this.tamEngineers = tamEngineers;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacksTamEngineers> getTamEngineers() {
            return this.tamEngineers;
        }

    }

    public static class GetServiceDetailResponseBodyDataPerformanceOrdersServiceMonthReports extends TeaModel {
        @NameInMap("appointmentId")
        public String appointmentId;

        @NameInMap("batchGroup")
        public String batchGroup;

        @NameInMap("customerId")
        public String customerId;

        @NameInMap("fileName")
        public String fileName;

        @NameInMap("fileType")
        public Integer fileType;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("remarke")
        public String remarke;

        @NameInMap("serviceApplyId")
        public Long serviceApplyId;

        @NameInMap("status")
        public Integer status;

        @NameInMap("url")
        public String url;

        public static GetServiceDetailResponseBodyDataPerformanceOrdersServiceMonthReports build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataPerformanceOrdersServiceMonthReports self = new GetServiceDetailResponseBodyDataPerformanceOrdersServiceMonthReports();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceMonthReports setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceMonthReports setBatchGroup(String batchGroup) {
            this.batchGroup = batchGroup;
            return this;
        }
        public String getBatchGroup() {
            return this.batchGroup;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceMonthReports setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceMonthReports setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceMonthReports setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceMonthReports setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceMonthReports setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceMonthReports setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceMonthReports setRemarke(String remarke) {
            this.remarke = remarke;
            return this;
        }
        public String getRemarke() {
            return this.remarke;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceMonthReports setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceMonthReports setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceMonthReports setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetServiceDetailResponseBodyDataPerformanceOrdersServiceReports extends TeaModel {
        @NameInMap("appointmentId")
        public String appointmentId;

        @NameInMap("batchGroup")
        public String batchGroup;

        @NameInMap("customerId")
        public String customerId;

        @NameInMap("fileName")
        public String fileName;

        @NameInMap("fileType")
        public Integer fileType;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("remarke")
        public String remarke;

        @NameInMap("serviceApplyId")
        public Long serviceApplyId;

        @NameInMap("status")
        public Integer status;

        @NameInMap("url")
        public String url;

        public static GetServiceDetailResponseBodyDataPerformanceOrdersServiceReports build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataPerformanceOrdersServiceReports self = new GetServiceDetailResponseBodyDataPerformanceOrdersServiceReports();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceReports setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceReports setBatchGroup(String batchGroup) {
            this.batchGroup = batchGroup;
            return this;
        }
        public String getBatchGroup() {
            return this.batchGroup;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceReports setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceReports setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceReports setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceReports setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceReports setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceReports setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceReports setRemarke(String remarke) {
            this.remarke = remarke;
            return this;
        }
        public String getRemarke() {
            return this.remarke;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceReports setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceReports setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceReports setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetServiceDetailResponseBodyDataPerformanceOrdersServiceSchemes extends TeaModel {
        @NameInMap("appointmentId")
        public String appointmentId;

        @NameInMap("batchGroup")
        public String batchGroup;

        @NameInMap("customerId")
        public String customerId;

        @NameInMap("fileName")
        public String fileName;

        @NameInMap("fileType")
        public Integer fileType;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("remarke")
        public String remarke;

        @NameInMap("serviceApplyId")
        public Long serviceApplyId;

        @NameInMap("status")
        public Integer status;

        @NameInMap("url")
        public String url;

        public static GetServiceDetailResponseBodyDataPerformanceOrdersServiceSchemes build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataPerformanceOrdersServiceSchemes self = new GetServiceDetailResponseBodyDataPerformanceOrdersServiceSchemes();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceSchemes setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceSchemes setBatchGroup(String batchGroup) {
            this.batchGroup = batchGroup;
            return this;
        }
        public String getBatchGroup() {
            return this.batchGroup;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceSchemes setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceSchemes setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceSchemes setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceSchemes setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceSchemes setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceSchemes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceSchemes setRemarke(String remarke) {
            this.remarke = remarke;
            return this;
        }
        public String getRemarke() {
            return this.remarke;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceSchemes setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceSchemes setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersServiceSchemes setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetServiceDetailResponseBodyDataPerformanceOrdersTamEngineers extends TeaModel {
        @NameInMap("creatorEmpId")
        public String creatorEmpId;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("hrStatus")
        public String hrStatus;

        @NameInMap("id")
        public Long id;

        @NameInMap("lastName")
        public String lastName;

        @NameInMap("modifierEmpId")
        public String modifierEmpId;

        @NameInMap("name")
        public String name;

        @NameInMap("nickNameEn")
        public String nickNameEn;

        @NameInMap("realmId")
        public Long realmId;

        @NameInMap("workid")
        public String workid;

        public static GetServiceDetailResponseBodyDataPerformanceOrdersTamEngineers build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataPerformanceOrdersTamEngineers self = new GetServiceDetailResponseBodyDataPerformanceOrdersTamEngineers();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersTamEngineers setCreatorEmpId(String creatorEmpId) {
            this.creatorEmpId = creatorEmpId;
            return this;
        }
        public String getCreatorEmpId() {
            return this.creatorEmpId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersTamEngineers setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersTamEngineers setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersTamEngineers setHrStatus(String hrStatus) {
            this.hrStatus = hrStatus;
            return this;
        }
        public String getHrStatus() {
            return this.hrStatus;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersTamEngineers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersTamEngineers setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersTamEngineers setModifierEmpId(String modifierEmpId) {
            this.modifierEmpId = modifierEmpId;
            return this;
        }
        public String getModifierEmpId() {
            return this.modifierEmpId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersTamEngineers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersTamEngineers setNickNameEn(String nickNameEn) {
            this.nickNameEn = nickNameEn;
            return this;
        }
        public String getNickNameEn() {
            return this.nickNameEn;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersTamEngineers setRealmId(Long realmId) {
            this.realmId = realmId;
            return this;
        }
        public Long getRealmId() {
            return this.realmId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrdersTamEngineers setWorkid(String workid) {
            this.workid = workid;
            return this;
        }
        public String getWorkid() {
            return this.workid;
        }

    }

    public static class GetServiceDetailResponseBodyDataPerformanceOrders extends TeaModel {
        @NameInMap("applyFileVOList")
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersApplyFileVOList> applyFileVOList;

        @NameInMap("appointmentCode")
        public String appointmentCode;

        @NameInMap("appointmentEndTime")
        public Long appointmentEndTime;

        @NameInMap("appointmentId")
        public String appointmentId;

        @NameInMap("appointmentPassTime")
        public Long appointmentPassTime;

        @NameInMap("appointmentTime")
        public Long appointmentTime;

        @NameInMap("commodityDesc")
        public String commodityDesc;

        @NameInMap("creatorEmpId")
        public String creatorEmpId;

        @NameInMap("cycleService")
        public Boolean cycleService;

        @NameInMap("extList")
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersExtList> extList;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("mergeSolutionAndReporterOneStep")
        public Boolean mergeSolutionAndReporterOneStep;

        @NameInMap("modifierEmpId")
        public String modifierEmpId;

        @NameInMap("orderDetail")
        public Object orderDetail;

        @NameInMap("orderId")
        public Long orderId;

        @NameInMap("packCount")
        public Integer packCount;

        @NameInMap("packDetails")
        public java.util.List<java.util.Map<String, ?>> packDetails;

        @NameInMap("performanceNodeDTOS")
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersPerformanceNodeDTOS> performanceNodeDTOS;

        @NameInMap("performancePacks")
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks> performancePacks;

        @NameInMap("purchasePackCode")
        public Integer purchasePackCode;

        @NameInMap("serviceApplyId")
        public Long serviceApplyId;

        @NameInMap("serviceMonthReports")
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersServiceMonthReports> serviceMonthReports;

        @NameInMap("serviceReports")
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersServiceReports> serviceReports;

        @NameInMap("serviceSchemes")
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersServiceSchemes> serviceSchemes;

        @NameInMap("status")
        public Integer status;

        @NameInMap("statusStr")
        public String statusStr;

        @NameInMap("supportTime")
        public java.util.List<Long> supportTime;

        @NameInMap("tamEngineers")
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersTamEngineers> tamEngineers;

        public static GetServiceDetailResponseBodyDataPerformanceOrders build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataPerformanceOrders self = new GetServiceDetailResponseBodyDataPerformanceOrders();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setApplyFileVOList(java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersApplyFileVOList> applyFileVOList) {
            this.applyFileVOList = applyFileVOList;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersApplyFileVOList> getApplyFileVOList() {
            return this.applyFileVOList;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setAppointmentCode(String appointmentCode) {
            this.appointmentCode = appointmentCode;
            return this;
        }
        public String getAppointmentCode() {
            return this.appointmentCode;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setAppointmentEndTime(Long appointmentEndTime) {
            this.appointmentEndTime = appointmentEndTime;
            return this;
        }
        public Long getAppointmentEndTime() {
            return this.appointmentEndTime;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setAppointmentPassTime(Long appointmentPassTime) {
            this.appointmentPassTime = appointmentPassTime;
            return this;
        }
        public Long getAppointmentPassTime() {
            return this.appointmentPassTime;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setAppointmentTime(Long appointmentTime) {
            this.appointmentTime = appointmentTime;
            return this;
        }
        public Long getAppointmentTime() {
            return this.appointmentTime;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setCommodityDesc(String commodityDesc) {
            this.commodityDesc = commodityDesc;
            return this;
        }
        public String getCommodityDesc() {
            return this.commodityDesc;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setCreatorEmpId(String creatorEmpId) {
            this.creatorEmpId = creatorEmpId;
            return this;
        }
        public String getCreatorEmpId() {
            return this.creatorEmpId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setCycleService(Boolean cycleService) {
            this.cycleService = cycleService;
            return this;
        }
        public Boolean getCycleService() {
            return this.cycleService;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setExtList(java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersExtList> extList) {
            this.extList = extList;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersExtList> getExtList() {
            return this.extList;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setMergeSolutionAndReporterOneStep(Boolean mergeSolutionAndReporterOneStep) {
            this.mergeSolutionAndReporterOneStep = mergeSolutionAndReporterOneStep;
            return this;
        }
        public Boolean getMergeSolutionAndReporterOneStep() {
            return this.mergeSolutionAndReporterOneStep;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setModifierEmpId(String modifierEmpId) {
            this.modifierEmpId = modifierEmpId;
            return this;
        }
        public String getModifierEmpId() {
            return this.modifierEmpId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setOrderDetail(Object orderDetail) {
            this.orderDetail = orderDetail;
            return this;
        }
        public Object getOrderDetail() {
            return this.orderDetail;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setPackCount(Integer packCount) {
            this.packCount = packCount;
            return this;
        }
        public Integer getPackCount() {
            return this.packCount;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setPackDetails(java.util.List<java.util.Map<String, ?>> packDetails) {
            this.packDetails = packDetails;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getPackDetails() {
            return this.packDetails;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setPerformanceNodeDTOS(java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersPerformanceNodeDTOS> performanceNodeDTOS) {
            this.performanceNodeDTOS = performanceNodeDTOS;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersPerformanceNodeDTOS> getPerformanceNodeDTOS() {
            return this.performanceNodeDTOS;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setPerformancePacks(java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks> performancePacks) {
            this.performancePacks = performancePacks;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersPerformancePacks> getPerformancePacks() {
            return this.performancePacks;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setPurchasePackCode(Integer purchasePackCode) {
            this.purchasePackCode = purchasePackCode;
            return this;
        }
        public Integer getPurchasePackCode() {
            return this.purchasePackCode;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setServiceMonthReports(java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersServiceMonthReports> serviceMonthReports) {
            this.serviceMonthReports = serviceMonthReports;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersServiceMonthReports> getServiceMonthReports() {
            return this.serviceMonthReports;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setServiceReports(java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersServiceReports> serviceReports) {
            this.serviceReports = serviceReports;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersServiceReports> getServiceReports() {
            return this.serviceReports;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setServiceSchemes(java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersServiceSchemes> serviceSchemes) {
            this.serviceSchemes = serviceSchemes;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersServiceSchemes> getServiceSchemes() {
            return this.serviceSchemes;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setStatusStr(String statusStr) {
            this.statusStr = statusStr;
            return this;
        }
        public String getStatusStr() {
            return this.statusStr;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setSupportTime(java.util.List<Long> supportTime) {
            this.supportTime = supportTime;
            return this;
        }
        public java.util.List<Long> getSupportTime() {
            return this.supportTime;
        }

        public GetServiceDetailResponseBodyDataPerformanceOrders setTamEngineers(java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersTamEngineers> tamEngineers) {
            this.tamEngineers = tamEngineers;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrdersTamEngineers> getTamEngineers() {
            return this.tamEngineers;
        }

    }

    public static class GetServiceDetailResponseBodyDataPerformancePacksApplyFileVOList extends TeaModel {
        @NameInMap("appointmentId")
        public String appointmentId;

        @NameInMap("batchGroup")
        public String batchGroup;

        @NameInMap("customerId")
        public String customerId;

        @NameInMap("fileName")
        public String fileName;

        @NameInMap("fileType")
        public Integer fileType;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("remarke")
        public String remarke;

        @NameInMap("serviceApplyId")
        public Long serviceApplyId;

        @NameInMap("status")
        public Integer status;

        @NameInMap("url")
        public String url;

        public static GetServiceDetailResponseBodyDataPerformancePacksApplyFileVOList build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataPerformancePacksApplyFileVOList self = new GetServiceDetailResponseBodyDataPerformancePacksApplyFileVOList();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataPerformancePacksApplyFileVOList setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksApplyFileVOList setBatchGroup(String batchGroup) {
            this.batchGroup = batchGroup;
            return this;
        }
        public String getBatchGroup() {
            return this.batchGroup;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksApplyFileVOList setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksApplyFileVOList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksApplyFileVOList setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksApplyFileVOList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksApplyFileVOList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksApplyFileVOList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksApplyFileVOList setRemarke(String remarke) {
            this.remarke = remarke;
            return this;
        }
        public String getRemarke() {
            return this.remarke;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksApplyFileVOList setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksApplyFileVOList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksApplyFileVOList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetServiceDetailResponseBodyDataPerformancePacksExtList extends TeaModel {
        @NameInMap("keyCode")
        public String keyCode;

        @NameInMap("name")
        public String name;

        @NameInMap("value")
        public Object value;

        @NameInMap("view")
        public String view;

        public static GetServiceDetailResponseBodyDataPerformancePacksExtList build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataPerformancePacksExtList self = new GetServiceDetailResponseBodyDataPerformancePacksExtList();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataPerformancePacksExtList setKeyCode(String keyCode) {
            this.keyCode = keyCode;
            return this;
        }
        public String getKeyCode() {
            return this.keyCode;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksExtList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksExtList setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksExtList setView(String view) {
            this.view = view;
            return this;
        }
        public String getView() {
            return this.view;
        }

    }

    public static class GetServiceDetailResponseBodyDataPerformancePacksPerformanceNodeDTOS extends TeaModel {
        @NameInMap("display")
        public Boolean display;

        @NameInMap("extendInfo")
        public Object extendInfo;

        @NameInMap("index")
        public Integer index;

        @NameInMap("nodeName")
        public String nodeName;

        @NameInMap("status")
        public Integer status;

        public static GetServiceDetailResponseBodyDataPerformancePacksPerformanceNodeDTOS build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataPerformancePacksPerformanceNodeDTOS self = new GetServiceDetailResponseBodyDataPerformancePacksPerformanceNodeDTOS();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataPerformancePacksPerformanceNodeDTOS setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksPerformanceNodeDTOS setExtendInfo(Object extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public Object getExtendInfo() {
            return this.extendInfo;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksPerformanceNodeDTOS setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksPerformanceNodeDTOS setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksPerformanceNodeDTOS setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class GetServiceDetailResponseBodyDataPerformancePacksServiceMonthReports extends TeaModel {
        @NameInMap("appointmentId")
        public String appointmentId;

        @NameInMap("batchGroup")
        public String batchGroup;

        @NameInMap("customerId")
        public String customerId;

        @NameInMap("fileName")
        public String fileName;

        @NameInMap("fileType")
        public Integer fileType;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("remarke")
        public String remarke;

        @NameInMap("serviceApplyId")
        public Long serviceApplyId;

        @NameInMap("status")
        public Integer status;

        @NameInMap("url")
        public String url;

        public static GetServiceDetailResponseBodyDataPerformancePacksServiceMonthReports build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataPerformancePacksServiceMonthReports self = new GetServiceDetailResponseBodyDataPerformancePacksServiceMonthReports();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceMonthReports setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceMonthReports setBatchGroup(String batchGroup) {
            this.batchGroup = batchGroup;
            return this;
        }
        public String getBatchGroup() {
            return this.batchGroup;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceMonthReports setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceMonthReports setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceMonthReports setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceMonthReports setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceMonthReports setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceMonthReports setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceMonthReports setRemarke(String remarke) {
            this.remarke = remarke;
            return this;
        }
        public String getRemarke() {
            return this.remarke;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceMonthReports setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceMonthReports setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceMonthReports setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetServiceDetailResponseBodyDataPerformancePacksServiceReports extends TeaModel {
        @NameInMap("appointmentId")
        public String appointmentId;

        @NameInMap("batchGroup")
        public String batchGroup;

        @NameInMap("customerId")
        public String customerId;

        @NameInMap("fileName")
        public String fileName;

        @NameInMap("fileType")
        public Integer fileType;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("remarke")
        public String remarke;

        @NameInMap("serviceApplyId")
        public Long serviceApplyId;

        @NameInMap("status")
        public Integer status;

        @NameInMap("url")
        public String url;

        public static GetServiceDetailResponseBodyDataPerformancePacksServiceReports build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataPerformancePacksServiceReports self = new GetServiceDetailResponseBodyDataPerformancePacksServiceReports();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceReports setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceReports setBatchGroup(String batchGroup) {
            this.batchGroup = batchGroup;
            return this;
        }
        public String getBatchGroup() {
            return this.batchGroup;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceReports setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceReports setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceReports setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceReports setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceReports setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceReports setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceReports setRemarke(String remarke) {
            this.remarke = remarke;
            return this;
        }
        public String getRemarke() {
            return this.remarke;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceReports setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceReports setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceReports setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetServiceDetailResponseBodyDataPerformancePacksServiceSchemes extends TeaModel {
        @NameInMap("appointmentId")
        public String appointmentId;

        @NameInMap("batchGroup")
        public String batchGroup;

        @NameInMap("customerId")
        public String customerId;

        @NameInMap("fileName")
        public String fileName;

        @NameInMap("fileType")
        public Integer fileType;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("remarke")
        public String remarke;

        @NameInMap("serviceApplyId")
        public Long serviceApplyId;

        @NameInMap("status")
        public Integer status;

        @NameInMap("url")
        public String url;

        public static GetServiceDetailResponseBodyDataPerformancePacksServiceSchemes build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataPerformancePacksServiceSchemes self = new GetServiceDetailResponseBodyDataPerformancePacksServiceSchemes();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceSchemes setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceSchemes setBatchGroup(String batchGroup) {
            this.batchGroup = batchGroup;
            return this;
        }
        public String getBatchGroup() {
            return this.batchGroup;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceSchemes setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceSchemes setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceSchemes setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceSchemes setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceSchemes setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceSchemes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceSchemes setRemarke(String remarke) {
            this.remarke = remarke;
            return this;
        }
        public String getRemarke() {
            return this.remarke;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceSchemes setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceSchemes setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksServiceSchemes setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetServiceDetailResponseBodyDataPerformancePacksTamEngineers extends TeaModel {
        @NameInMap("creatorEmpId")
        public String creatorEmpId;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("hrStatus")
        public String hrStatus;

        @NameInMap("id")
        public Long id;

        @NameInMap("lastName")
        public String lastName;

        @NameInMap("modifierEmpId")
        public String modifierEmpId;

        @NameInMap("name")
        public String name;

        @NameInMap("nickNameEn")
        public String nickNameEn;

        @NameInMap("realmId")
        public Long realmId;

        @NameInMap("workid")
        public String workid;

        public static GetServiceDetailResponseBodyDataPerformancePacksTamEngineers build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataPerformancePacksTamEngineers self = new GetServiceDetailResponseBodyDataPerformancePacksTamEngineers();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataPerformancePacksTamEngineers setCreatorEmpId(String creatorEmpId) {
            this.creatorEmpId = creatorEmpId;
            return this;
        }
        public String getCreatorEmpId() {
            return this.creatorEmpId;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksTamEngineers setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksTamEngineers setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksTamEngineers setHrStatus(String hrStatus) {
            this.hrStatus = hrStatus;
            return this;
        }
        public String getHrStatus() {
            return this.hrStatus;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksTamEngineers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksTamEngineers setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksTamEngineers setModifierEmpId(String modifierEmpId) {
            this.modifierEmpId = modifierEmpId;
            return this;
        }
        public String getModifierEmpId() {
            return this.modifierEmpId;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksTamEngineers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksTamEngineers setNickNameEn(String nickNameEn) {
            this.nickNameEn = nickNameEn;
            return this;
        }
        public String getNickNameEn() {
            return this.nickNameEn;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksTamEngineers setRealmId(Long realmId) {
            this.realmId = realmId;
            return this;
        }
        public Long getRealmId() {
            return this.realmId;
        }

        public GetServiceDetailResponseBodyDataPerformancePacksTamEngineers setWorkid(String workid) {
            this.workid = workid;
            return this;
        }
        public String getWorkid() {
            return this.workid;
        }

    }

    public static class GetServiceDetailResponseBodyDataPerformancePacks extends TeaModel {
        @NameInMap("applyFileVOList")
        public java.util.List<GetServiceDetailResponseBodyDataPerformancePacksApplyFileVOList> applyFileVOList;

        @NameInMap("appointmentCode")
        public String appointmentCode;

        @NameInMap("appointmentEndTime")
        public Long appointmentEndTime;

        @NameInMap("appointmentId")
        public String appointmentId;

        @NameInMap("appointmentPassTime")
        public Long appointmentPassTime;

        @NameInMap("appointmentTime")
        public Long appointmentTime;

        @NameInMap("commodityDesc")
        public String commodityDesc;

        @NameInMap("creatorEmpId")
        public String creatorEmpId;

        @NameInMap("cycleService")
        public Boolean cycleService;

        @NameInMap("extList")
        public java.util.List<GetServiceDetailResponseBodyDataPerformancePacksExtList> extList;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("mergeSolutionAndReporterOneStep")
        public Boolean mergeSolutionAndReporterOneStep;

        @NameInMap("modifierEmpId")
        public String modifierEmpId;

        @NameInMap("orderDetail")
        public Object orderDetail;

        @NameInMap("orderId")
        public Long orderId;

        @NameInMap("performanceNodeDTOS")
        public java.util.List<GetServiceDetailResponseBodyDataPerformancePacksPerformanceNodeDTOS> performanceNodeDTOS;

        @NameInMap("purchasePackCode")
        public Integer purchasePackCode;

        @NameInMap("serviceApplyId")
        public Long serviceApplyId;

        @NameInMap("serviceMonthReports")
        public java.util.List<GetServiceDetailResponseBodyDataPerformancePacksServiceMonthReports> serviceMonthReports;

        @NameInMap("serviceReports")
        public java.util.List<GetServiceDetailResponseBodyDataPerformancePacksServiceReports> serviceReports;

        @NameInMap("serviceSchemes")
        public java.util.List<GetServiceDetailResponseBodyDataPerformancePacksServiceSchemes> serviceSchemes;

        @NameInMap("status")
        public Integer status;

        @NameInMap("statusStr")
        public String statusStr;

        @NameInMap("supportTime")
        public java.util.List<Long> supportTime;

        @NameInMap("tamEngineers")
        public java.util.List<GetServiceDetailResponseBodyDataPerformancePacksTamEngineers> tamEngineers;

        public static GetServiceDetailResponseBodyDataPerformancePacks build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataPerformancePacks self = new GetServiceDetailResponseBodyDataPerformancePacks();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataPerformancePacks setApplyFileVOList(java.util.List<GetServiceDetailResponseBodyDataPerformancePacksApplyFileVOList> applyFileVOList) {
            this.applyFileVOList = applyFileVOList;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataPerformancePacksApplyFileVOList> getApplyFileVOList() {
            return this.applyFileVOList;
        }

        public GetServiceDetailResponseBodyDataPerformancePacks setAppointmentCode(String appointmentCode) {
            this.appointmentCode = appointmentCode;
            return this;
        }
        public String getAppointmentCode() {
            return this.appointmentCode;
        }

        public GetServiceDetailResponseBodyDataPerformancePacks setAppointmentEndTime(Long appointmentEndTime) {
            this.appointmentEndTime = appointmentEndTime;
            return this;
        }
        public Long getAppointmentEndTime() {
            return this.appointmentEndTime;
        }

        public GetServiceDetailResponseBodyDataPerformancePacks setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public GetServiceDetailResponseBodyDataPerformancePacks setAppointmentPassTime(Long appointmentPassTime) {
            this.appointmentPassTime = appointmentPassTime;
            return this;
        }
        public Long getAppointmentPassTime() {
            return this.appointmentPassTime;
        }

        public GetServiceDetailResponseBodyDataPerformancePacks setAppointmentTime(Long appointmentTime) {
            this.appointmentTime = appointmentTime;
            return this;
        }
        public Long getAppointmentTime() {
            return this.appointmentTime;
        }

        public GetServiceDetailResponseBodyDataPerformancePacks setCommodityDesc(String commodityDesc) {
            this.commodityDesc = commodityDesc;
            return this;
        }
        public String getCommodityDesc() {
            return this.commodityDesc;
        }

        public GetServiceDetailResponseBodyDataPerformancePacks setCreatorEmpId(String creatorEmpId) {
            this.creatorEmpId = creatorEmpId;
            return this;
        }
        public String getCreatorEmpId() {
            return this.creatorEmpId;
        }

        public GetServiceDetailResponseBodyDataPerformancePacks setCycleService(Boolean cycleService) {
            this.cycleService = cycleService;
            return this;
        }
        public Boolean getCycleService() {
            return this.cycleService;
        }

        public GetServiceDetailResponseBodyDataPerformancePacks setExtList(java.util.List<GetServiceDetailResponseBodyDataPerformancePacksExtList> extList) {
            this.extList = extList;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataPerformancePacksExtList> getExtList() {
            return this.extList;
        }

        public GetServiceDetailResponseBodyDataPerformancePacks setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetServiceDetailResponseBodyDataPerformancePacks setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetServiceDetailResponseBodyDataPerformancePacks setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetServiceDetailResponseBodyDataPerformancePacks setMergeSolutionAndReporterOneStep(Boolean mergeSolutionAndReporterOneStep) {
            this.mergeSolutionAndReporterOneStep = mergeSolutionAndReporterOneStep;
            return this;
        }
        public Boolean getMergeSolutionAndReporterOneStep() {
            return this.mergeSolutionAndReporterOneStep;
        }

        public GetServiceDetailResponseBodyDataPerformancePacks setModifierEmpId(String modifierEmpId) {
            this.modifierEmpId = modifierEmpId;
            return this;
        }
        public String getModifierEmpId() {
            return this.modifierEmpId;
        }

        public GetServiceDetailResponseBodyDataPerformancePacks setOrderDetail(Object orderDetail) {
            this.orderDetail = orderDetail;
            return this;
        }
        public Object getOrderDetail() {
            return this.orderDetail;
        }

        public GetServiceDetailResponseBodyDataPerformancePacks setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public GetServiceDetailResponseBodyDataPerformancePacks setPerformanceNodeDTOS(java.util.List<GetServiceDetailResponseBodyDataPerformancePacksPerformanceNodeDTOS> performanceNodeDTOS) {
            this.performanceNodeDTOS = performanceNodeDTOS;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataPerformancePacksPerformanceNodeDTOS> getPerformanceNodeDTOS() {
            return this.performanceNodeDTOS;
        }

        public GetServiceDetailResponseBodyDataPerformancePacks setPurchasePackCode(Integer purchasePackCode) {
            this.purchasePackCode = purchasePackCode;
            return this;
        }
        public Integer getPurchasePackCode() {
            return this.purchasePackCode;
        }

        public GetServiceDetailResponseBodyDataPerformancePacks setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public GetServiceDetailResponseBodyDataPerformancePacks setServiceMonthReports(java.util.List<GetServiceDetailResponseBodyDataPerformancePacksServiceMonthReports> serviceMonthReports) {
            this.serviceMonthReports = serviceMonthReports;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataPerformancePacksServiceMonthReports> getServiceMonthReports() {
            return this.serviceMonthReports;
        }

        public GetServiceDetailResponseBodyDataPerformancePacks setServiceReports(java.util.List<GetServiceDetailResponseBodyDataPerformancePacksServiceReports> serviceReports) {
            this.serviceReports = serviceReports;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataPerformancePacksServiceReports> getServiceReports() {
            return this.serviceReports;
        }

        public GetServiceDetailResponseBodyDataPerformancePacks setServiceSchemes(java.util.List<GetServiceDetailResponseBodyDataPerformancePacksServiceSchemes> serviceSchemes) {
            this.serviceSchemes = serviceSchemes;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataPerformancePacksServiceSchemes> getServiceSchemes() {
            return this.serviceSchemes;
        }

        public GetServiceDetailResponseBodyDataPerformancePacks setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetServiceDetailResponseBodyDataPerformancePacks setStatusStr(String statusStr) {
            this.statusStr = statusStr;
            return this;
        }
        public String getStatusStr() {
            return this.statusStr;
        }

        public GetServiceDetailResponseBodyDataPerformancePacks setSupportTime(java.util.List<Long> supportTime) {
            this.supportTime = supportTime;
            return this;
        }
        public java.util.List<Long> getSupportTime() {
            return this.supportTime;
        }

        public GetServiceDetailResponseBodyDataPerformancePacks setTamEngineers(java.util.List<GetServiceDetailResponseBodyDataPerformancePacksTamEngineers> tamEngineers) {
            this.tamEngineers = tamEngineers;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataPerformancePacksTamEngineers> getTamEngineers() {
            return this.tamEngineers;
        }

    }

    public static class GetServiceDetailResponseBodyDataServiceReports extends TeaModel {
        @NameInMap("appointmentId")
        public String appointmentId;

        @NameInMap("batchGroup")
        public String batchGroup;

        @NameInMap("customerId")
        public String customerId;

        @NameInMap("fileName")
        public String fileName;

        @NameInMap("fileType")
        public Integer fileType;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("remarke")
        public String remarke;

        @NameInMap("serviceApplyId")
        public Long serviceApplyId;

        @NameInMap("status")
        public Integer status;

        @NameInMap("url")
        public String url;

        public static GetServiceDetailResponseBodyDataServiceReports build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataServiceReports self = new GetServiceDetailResponseBodyDataServiceReports();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataServiceReports setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public GetServiceDetailResponseBodyDataServiceReports setBatchGroup(String batchGroup) {
            this.batchGroup = batchGroup;
            return this;
        }
        public String getBatchGroup() {
            return this.batchGroup;
        }

        public GetServiceDetailResponseBodyDataServiceReports setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetServiceDetailResponseBodyDataServiceReports setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetServiceDetailResponseBodyDataServiceReports setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public GetServiceDetailResponseBodyDataServiceReports setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetServiceDetailResponseBodyDataServiceReports setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetServiceDetailResponseBodyDataServiceReports setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetServiceDetailResponseBodyDataServiceReports setRemarke(String remarke) {
            this.remarke = remarke;
            return this;
        }
        public String getRemarke() {
            return this.remarke;
        }

        public GetServiceDetailResponseBodyDataServiceReports setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public GetServiceDetailResponseBodyDataServiceReports setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetServiceDetailResponseBodyDataServiceReports setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetServiceDetailResponseBodyData extends TeaModel {
        @NameInMap("applierId")
        public String applierId;

        @NameInMap("applyCode")
        public String applyCode;

        @NameInMap("applyTime")
        public Long applyTime;

        @NameInMap("appointments")
        public java.util.List<GetServiceDetailResponseBodyDataAppointments> appointments;

        @NameInMap("buyUrl")
        public String buyUrl;

        @NameInMap("creatorEmpId")
        public String creatorEmpId;

        @NameInMap("customerName")
        public String customerName;

        @NameInMap("cycleService")
        public Boolean cycleService;

        @NameInMap("executedCount")
        public Long executedCount;

        @NameInMap("finishCount")
        public Long finishCount;

        @NameInMap("formMap")
        public java.util.Map<String, ?> formMap;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("mergeSolutionAndReporterOneStep")
        public Boolean mergeSolutionAndReporterOneStep;

        @NameInMap("modifierEmpId")
        public String modifierEmpId;

        @NameInMap("packDetails")
        public java.util.List<java.util.Map<String, ?>> packDetails;

        @NameInMap("payOrders")
        public java.util.List<GetServiceDetailResponseBodyDataPayOrders> payOrders;

        @NameInMap("payUrl")
        public String payUrl;

        @NameInMap("performanceOrders")
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrders> performanceOrders;

        @NameInMap("performancePacks")
        public java.util.List<GetServiceDetailResponseBodyDataPerformancePacks> performancePacks;

        @NameInMap("reneWalUrl")
        public String reneWalUrl;

        @NameInMap("serviceCode")
        public String serviceCode;

        @NameInMap("serviceName")
        public String serviceName;

        @NameInMap("serviceReports")
        public java.util.List<GetServiceDetailResponseBodyDataServiceReports> serviceReports;

        @NameInMap("serviceTimeRange")
        public java.util.List<Long> serviceTimeRange;

        @NameInMap("status")
        public String status;

        @NameInMap("statusCode")
        public Integer statusCode;

        @NameInMap("statusStr")
        public String statusStr;

        @NameInMap("termOfValidity")
        public String termOfValidity;

        @NameInMap("totalPack")
        public Integer totalPack;

        @NameInMap("type")
        public String type;

        @NameInMap("usePack")
        public Long usePack;

        public static GetServiceDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyData self = new GetServiceDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyData setApplierId(String applierId) {
            this.applierId = applierId;
            return this;
        }
        public String getApplierId() {
            return this.applierId;
        }

        public GetServiceDetailResponseBodyData setApplyCode(String applyCode) {
            this.applyCode = applyCode;
            return this;
        }
        public String getApplyCode() {
            return this.applyCode;
        }

        public GetServiceDetailResponseBodyData setApplyTime(Long applyTime) {
            this.applyTime = applyTime;
            return this;
        }
        public Long getApplyTime() {
            return this.applyTime;
        }

        public GetServiceDetailResponseBodyData setAppointments(java.util.List<GetServiceDetailResponseBodyDataAppointments> appointments) {
            this.appointments = appointments;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataAppointments> getAppointments() {
            return this.appointments;
        }

        public GetServiceDetailResponseBodyData setBuyUrl(String buyUrl) {
            this.buyUrl = buyUrl;
            return this;
        }
        public String getBuyUrl() {
            return this.buyUrl;
        }

        public GetServiceDetailResponseBodyData setCreatorEmpId(String creatorEmpId) {
            this.creatorEmpId = creatorEmpId;
            return this;
        }
        public String getCreatorEmpId() {
            return this.creatorEmpId;
        }

        public GetServiceDetailResponseBodyData setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public String getCustomerName() {
            return this.customerName;
        }

        public GetServiceDetailResponseBodyData setCycleService(Boolean cycleService) {
            this.cycleService = cycleService;
            return this;
        }
        public Boolean getCycleService() {
            return this.cycleService;
        }

        public GetServiceDetailResponseBodyData setExecutedCount(Long executedCount) {
            this.executedCount = executedCount;
            return this;
        }
        public Long getExecutedCount() {
            return this.executedCount;
        }

        public GetServiceDetailResponseBodyData setFinishCount(Long finishCount) {
            this.finishCount = finishCount;
            return this;
        }
        public Long getFinishCount() {
            return this.finishCount;
        }

        public GetServiceDetailResponseBodyData setFormMap(java.util.Map<String, ?> formMap) {
            this.formMap = formMap;
            return this;
        }
        public java.util.Map<String, ?> getFormMap() {
            return this.formMap;
        }

        public GetServiceDetailResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetServiceDetailResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetServiceDetailResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetServiceDetailResponseBodyData setMergeSolutionAndReporterOneStep(Boolean mergeSolutionAndReporterOneStep) {
            this.mergeSolutionAndReporterOneStep = mergeSolutionAndReporterOneStep;
            return this;
        }
        public Boolean getMergeSolutionAndReporterOneStep() {
            return this.mergeSolutionAndReporterOneStep;
        }

        public GetServiceDetailResponseBodyData setModifierEmpId(String modifierEmpId) {
            this.modifierEmpId = modifierEmpId;
            return this;
        }
        public String getModifierEmpId() {
            return this.modifierEmpId;
        }

        public GetServiceDetailResponseBodyData setPackDetails(java.util.List<java.util.Map<String, ?>> packDetails) {
            this.packDetails = packDetails;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getPackDetails() {
            return this.packDetails;
        }

        public GetServiceDetailResponseBodyData setPayOrders(java.util.List<GetServiceDetailResponseBodyDataPayOrders> payOrders) {
            this.payOrders = payOrders;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataPayOrders> getPayOrders() {
            return this.payOrders;
        }

        public GetServiceDetailResponseBodyData setPayUrl(String payUrl) {
            this.payUrl = payUrl;
            return this;
        }
        public String getPayUrl() {
            return this.payUrl;
        }

        public GetServiceDetailResponseBodyData setPerformanceOrders(java.util.List<GetServiceDetailResponseBodyDataPerformanceOrders> performanceOrders) {
            this.performanceOrders = performanceOrders;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataPerformanceOrders> getPerformanceOrders() {
            return this.performanceOrders;
        }

        public GetServiceDetailResponseBodyData setPerformancePacks(java.util.List<GetServiceDetailResponseBodyDataPerformancePacks> performancePacks) {
            this.performancePacks = performancePacks;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataPerformancePacks> getPerformancePacks() {
            return this.performancePacks;
        }

        public GetServiceDetailResponseBodyData setReneWalUrl(String reneWalUrl) {
            this.reneWalUrl = reneWalUrl;
            return this;
        }
        public String getReneWalUrl() {
            return this.reneWalUrl;
        }

        public GetServiceDetailResponseBodyData setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public GetServiceDetailResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetServiceDetailResponseBodyData setServiceReports(java.util.List<GetServiceDetailResponseBodyDataServiceReports> serviceReports) {
            this.serviceReports = serviceReports;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataServiceReports> getServiceReports() {
            return this.serviceReports;
        }

        public GetServiceDetailResponseBodyData setServiceTimeRange(java.util.List<Long> serviceTimeRange) {
            this.serviceTimeRange = serviceTimeRange;
            return this;
        }
        public java.util.List<Long> getServiceTimeRange() {
            return this.serviceTimeRange;
        }

        public GetServiceDetailResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetServiceDetailResponseBodyData setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Integer getStatusCode() {
            return this.statusCode;
        }

        public GetServiceDetailResponseBodyData setStatusStr(String statusStr) {
            this.statusStr = statusStr;
            return this;
        }
        public String getStatusStr() {
            return this.statusStr;
        }

        public GetServiceDetailResponseBodyData setTermOfValidity(String termOfValidity) {
            this.termOfValidity = termOfValidity;
            return this;
        }
        public String getTermOfValidity() {
            return this.termOfValidity;
        }

        public GetServiceDetailResponseBodyData setTotalPack(Integer totalPack) {
            this.totalPack = totalPack;
            return this;
        }
        public Integer getTotalPack() {
            return this.totalPack;
        }

        public GetServiceDetailResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetServiceDetailResponseBodyData setUsePack(Long usePack) {
            this.usePack = usePack;
            return this;
        }
        public Long getUsePack() {
            return this.usePack;
        }

    }

}
