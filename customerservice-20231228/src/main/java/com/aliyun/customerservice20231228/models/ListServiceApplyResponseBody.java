// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class ListServiceApplyResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListServiceApplyResponseBodyData data;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListServiceApplyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceApplyResponseBody self = new ListServiceApplyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceApplyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListServiceApplyResponseBody setData(ListServiceApplyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListServiceApplyResponseBodyData getData() {
        return this.data;
    }

    public ListServiceApplyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListServiceApplyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListServiceApplyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceApplyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListServiceApplyResponseBodyDataListAppointments extends TeaModel {
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

        public static ListServiceApplyResponseBodyDataListAppointments build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataListAppointments self = new ListServiceApplyResponseBodyDataListAppointments();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataListAppointments setHuhangId(Long huhangId) {
            this.huhangId = huhangId;
            return this;
        }
        public Long getHuhangId() {
            return this.huhangId;
        }

        public ListServiceApplyResponseBodyDataListAppointments setPurchaseCode(Integer purchaseCode) {
            this.purchaseCode = purchaseCode;
            return this;
        }
        public Integer getPurchaseCode() {
            return this.purchaseCode;
        }

        public ListServiceApplyResponseBodyDataListAppointments setPurchaseDesc(String purchaseDesc) {
            this.purchaseDesc = purchaseDesc;
            return this;
        }
        public String getPurchaseDesc() {
            return this.purchaseDesc;
        }

        public ListServiceApplyResponseBodyDataListAppointments setSupportDays(Integer supportDays) {
            this.supportDays = supportDays;
            return this;
        }
        public Integer getSupportDays() {
            return this.supportDays;
        }

        public ListServiceApplyResponseBodyDataListAppointments setTravelDays(Integer travelDays) {
            this.travelDays = travelDays;
            return this;
        }
        public Integer getTravelDays() {
            return this.travelDays;
        }

    }

    public static class ListServiceApplyResponseBodyDataListPayOrders extends TeaModel {
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

        public static ListServiceApplyResponseBodyDataListPayOrders build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataListPayOrders self = new ListServiceApplyResponseBodyDataListPayOrders();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataListPayOrders setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public ListServiceApplyResponseBodyDataListPayOrders setCompassCommodityCode(String compassCommodityCode) {
            this.compassCommodityCode = compassCommodityCode;
            return this;
        }
        public String getCompassCommodityCode() {
            return this.compassCommodityCode;
        }

        public ListServiceApplyResponseBodyDataListPayOrders setCompassCommodityName(String compassCommodityName) {
            this.compassCommodityName = compassCommodityName;
            return this;
        }
        public String getCompassCommodityName() {
            return this.compassCommodityName;
        }

        public ListServiceApplyResponseBodyDataListPayOrders setCreatorEmpId(String creatorEmpId) {
            this.creatorEmpId = creatorEmpId;
            return this;
        }
        public String getCreatorEmpId() {
            return this.creatorEmpId;
        }

        public ListServiceApplyResponseBodyDataListPayOrders setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListServiceApplyResponseBodyDataListPayOrders setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListServiceApplyResponseBodyDataListPayOrders setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListServiceApplyResponseBodyDataListPayOrders setModifierEmpId(String modifierEmpId) {
            this.modifierEmpId = modifierEmpId;
            return this;
        }
        public String getModifierEmpId() {
            return this.modifierEmpId;
        }

        public ListServiceApplyResponseBodyDataListPayOrders setOperate(java.util.Map<String, ?> operate) {
            this.operate = operate;
            return this;
        }
        public java.util.Map<String, ?> getOperate() {
            return this.operate;
        }

        public ListServiceApplyResponseBodyDataListPayOrders setOrderDetail(Object orderDetail) {
            this.orderDetail = orderDetail;
            return this;
        }
        public Object getOrderDetail() {
            return this.orderDetail;
        }

        public ListServiceApplyResponseBodyDataListPayOrders setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public ListServiceApplyResponseBodyDataListPayOrders setOriginalPrice(Double originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Double getOriginalPrice() {
            return this.originalPrice;
        }

        public ListServiceApplyResponseBodyDataListPayOrders setPayAmount(Double payAmount) {
            this.payAmount = payAmount;
            return this;
        }
        public Double getPayAmount() {
            return this.payAmount;
        }

        public ListServiceApplyResponseBodyDataListPayOrders setPayTime(String payTime) {
            this.payTime = payTime;
            return this;
        }
        public String getPayTime() {
            return this.payTime;
        }

        public ListServiceApplyResponseBodyDataListPayOrders setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListServiceApplyResponseBodyDataListPayOrders setReneWalUrl(String reneWalUrl) {
            this.reneWalUrl = reneWalUrl;
            return this;
        }
        public String getReneWalUrl() {
            return this.reneWalUrl;
        }

        public ListServiceApplyResponseBodyDataListPayOrders setServiceContentMap(java.util.Map<String, ?> serviceContentMap) {
            this.serviceContentMap = serviceContentMap;
            return this;
        }
        public java.util.Map<String, ?> getServiceContentMap() {
            return this.serviceContentMap;
        }

        public ListServiceApplyResponseBodyDataListPayOrders setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListServiceApplyResponseBodyDataListPayOrders setStatusStr(String statusStr) {
            this.statusStr = statusStr;
            return this;
        }
        public String getStatusStr() {
            return this.statusStr;
        }

        public ListServiceApplyResponseBodyDataListPayOrders setSupportDays(Integer supportDays) {
            this.supportDays = supportDays;
            return this;
        }
        public Integer getSupportDays() {
            return this.supportDays;
        }

        public ListServiceApplyResponseBodyDataListPayOrders setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListServiceApplyResponseBodyDataListPayOrders setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListServiceApplyResponseBodyDataListPerformanceOrdersApplyFileVOList extends TeaModel {
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

        public static ListServiceApplyResponseBodyDataListPerformanceOrdersApplyFileVOList build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataListPerformanceOrdersApplyFileVOList self = new ListServiceApplyResponseBodyDataListPerformanceOrdersApplyFileVOList();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersApplyFileVOList setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersApplyFileVOList setBatchGroup(String batchGroup) {
            this.batchGroup = batchGroup;
            return this;
        }
        public String getBatchGroup() {
            return this.batchGroup;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersApplyFileVOList setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersApplyFileVOList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersApplyFileVOList setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersApplyFileVOList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersApplyFileVOList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersApplyFileVOList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersApplyFileVOList setRemarke(String remarke) {
            this.remarke = remarke;
            return this;
        }
        public String getRemarke() {
            return this.remarke;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersApplyFileVOList setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersApplyFileVOList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersApplyFileVOList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListServiceApplyResponseBodyDataListPerformanceOrdersExtList extends TeaModel {
        @NameInMap("keyCode")
        public String keyCode;

        @NameInMap("name")
        public String name;

        @NameInMap("value")
        public Object value;

        @NameInMap("view")
        public String view;

        public static ListServiceApplyResponseBodyDataListPerformanceOrdersExtList build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataListPerformanceOrdersExtList self = new ListServiceApplyResponseBodyDataListPerformanceOrdersExtList();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersExtList setKeyCode(String keyCode) {
            this.keyCode = keyCode;
            return this;
        }
        public String getKeyCode() {
            return this.keyCode;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersExtList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersExtList setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersExtList setView(String view) {
            this.view = view;
            return this;
        }
        public String getView() {
            return this.view;
        }

    }

    public static class ListServiceApplyResponseBodyDataListPerformanceOrdersPerformanceNodeDTOS extends TeaModel {
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

        public static ListServiceApplyResponseBodyDataListPerformanceOrdersPerformanceNodeDTOS build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataListPerformanceOrdersPerformanceNodeDTOS self = new ListServiceApplyResponseBodyDataListPerformanceOrdersPerformanceNodeDTOS();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformanceNodeDTOS setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformanceNodeDTOS setExtendInfo(Object extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public Object getExtendInfo() {
            return this.extendInfo;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformanceNodeDTOS setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformanceNodeDTOS setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformanceNodeDTOS setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksApplyFileVOList extends TeaModel {
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

        public static ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksApplyFileVOList build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksApplyFileVOList self = new ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksApplyFileVOList();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksApplyFileVOList setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksApplyFileVOList setBatchGroup(String batchGroup) {
            this.batchGroup = batchGroup;
            return this;
        }
        public String getBatchGroup() {
            return this.batchGroup;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksApplyFileVOList setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksApplyFileVOList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksApplyFileVOList setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksApplyFileVOList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksApplyFileVOList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksApplyFileVOList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksApplyFileVOList setRemarke(String remarke) {
            this.remarke = remarke;
            return this;
        }
        public String getRemarke() {
            return this.remarke;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksApplyFileVOList setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksApplyFileVOList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksApplyFileVOList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksExtList extends TeaModel {
        @NameInMap("keyCode")
        public String keyCode;

        @NameInMap("name")
        public String name;

        @NameInMap("value")
        public Object value;

        @NameInMap("view")
        public String view;

        public static ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksExtList build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksExtList self = new ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksExtList();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksExtList setKeyCode(String keyCode) {
            this.keyCode = keyCode;
            return this;
        }
        public String getKeyCode() {
            return this.keyCode;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksExtList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksExtList setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksExtList setView(String view) {
            this.view = view;
            return this;
        }
        public String getView() {
            return this.view;
        }

    }

    public static class ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksPerformanceNodeDTOS extends TeaModel {
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

        public static ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksPerformanceNodeDTOS build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksPerformanceNodeDTOS self = new ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksPerformanceNodeDTOS();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksPerformanceNodeDTOS setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksPerformanceNodeDTOS setExtendInfo(Object extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public Object getExtendInfo() {
            return this.extendInfo;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksPerformanceNodeDTOS setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksPerformanceNodeDTOS setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksPerformanceNodeDTOS setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceMonthReports extends TeaModel {
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

        public static ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceMonthReports build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceMonthReports self = new ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceMonthReports();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceMonthReports setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceMonthReports setBatchGroup(String batchGroup) {
            this.batchGroup = batchGroup;
            return this;
        }
        public String getBatchGroup() {
            return this.batchGroup;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceMonthReports setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceMonthReports setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceMonthReports setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceMonthReports setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceMonthReports setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceMonthReports setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceMonthReports setRemarke(String remarke) {
            this.remarke = remarke;
            return this;
        }
        public String getRemarke() {
            return this.remarke;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceMonthReports setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceMonthReports setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceMonthReports setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceReports extends TeaModel {
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

        public static ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceReports build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceReports self = new ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceReports();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceReports setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceReports setBatchGroup(String batchGroup) {
            this.batchGroup = batchGroup;
            return this;
        }
        public String getBatchGroup() {
            return this.batchGroup;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceReports setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceReports setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceReports setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceReports setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceReports setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceReports setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceReports setRemarke(String remarke) {
            this.remarke = remarke;
            return this;
        }
        public String getRemarke() {
            return this.remarke;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceReports setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceReports setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceReports setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceSchemes extends TeaModel {
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

        public static ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceSchemes build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceSchemes self = new ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceSchemes();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceSchemes setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceSchemes setBatchGroup(String batchGroup) {
            this.batchGroup = batchGroup;
            return this;
        }
        public String getBatchGroup() {
            return this.batchGroup;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceSchemes setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceSchemes setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceSchemes setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceSchemes setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceSchemes setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceSchemes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceSchemes setRemarke(String remarke) {
            this.remarke = remarke;
            return this;
        }
        public String getRemarke() {
            return this.remarke;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceSchemes setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceSchemes setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceSchemes setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksTamEngineers extends TeaModel {
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

        public static ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksTamEngineers build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksTamEngineers self = new ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksTamEngineers();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksTamEngineers setCreatorEmpId(String creatorEmpId) {
            this.creatorEmpId = creatorEmpId;
            return this;
        }
        public String getCreatorEmpId() {
            return this.creatorEmpId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksTamEngineers setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksTamEngineers setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksTamEngineers setHrStatus(String hrStatus) {
            this.hrStatus = hrStatus;
            return this;
        }
        public String getHrStatus() {
            return this.hrStatus;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksTamEngineers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksTamEngineers setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksTamEngineers setModifierEmpId(String modifierEmpId) {
            this.modifierEmpId = modifierEmpId;
            return this;
        }
        public String getModifierEmpId() {
            return this.modifierEmpId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksTamEngineers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksTamEngineers setNickNameEn(String nickNameEn) {
            this.nickNameEn = nickNameEn;
            return this;
        }
        public String getNickNameEn() {
            return this.nickNameEn;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksTamEngineers setRealmId(Long realmId) {
            this.realmId = realmId;
            return this;
        }
        public Long getRealmId() {
            return this.realmId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksTamEngineers setWorkid(String workid) {
            this.workid = workid;
            return this;
        }
        public String getWorkid() {
            return this.workid;
        }

    }

    public static class ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks extends TeaModel {
        @NameInMap("applyFileVOList")
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksApplyFileVOList> applyFileVOList;

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
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksExtList> extList;

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

        @NameInMap("ntmCommodityCode")
        public String ntmCommodityCode;

        @NameInMap("orderDetail")
        public Object orderDetail;

        @NameInMap("orderId")
        public Long orderId;

        @NameInMap("performanceNodeDTOS")
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksPerformanceNodeDTOS> performanceNodeDTOS;

        @NameInMap("purchasePackCode")
        public Integer purchasePackCode;

        @NameInMap("serviceApplyId")
        public Long serviceApplyId;

        @NameInMap("serviceMonthReports")
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceMonthReports> serviceMonthReports;

        @NameInMap("serviceReports")
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceReports> serviceReports;

        @NameInMap("serviceSchemes")
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceSchemes> serviceSchemes;

        @NameInMap("status")
        public Integer status;

        @NameInMap("statusStr")
        public String statusStr;

        @NameInMap("supportTime")
        public java.util.List<Long> supportTime;

        @NameInMap("tamEngineers")
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksTamEngineers> tamEngineers;

        public static ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks self = new ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setApplyFileVOList(java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksApplyFileVOList> applyFileVOList) {
            this.applyFileVOList = applyFileVOList;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksApplyFileVOList> getApplyFileVOList() {
            return this.applyFileVOList;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setAppointmentCode(String appointmentCode) {
            this.appointmentCode = appointmentCode;
            return this;
        }
        public String getAppointmentCode() {
            return this.appointmentCode;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setAppointmentEndTime(Long appointmentEndTime) {
            this.appointmentEndTime = appointmentEndTime;
            return this;
        }
        public Long getAppointmentEndTime() {
            return this.appointmentEndTime;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setAppointmentPassTime(Long appointmentPassTime) {
            this.appointmentPassTime = appointmentPassTime;
            return this;
        }
        public Long getAppointmentPassTime() {
            return this.appointmentPassTime;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setAppointmentTime(Long appointmentTime) {
            this.appointmentTime = appointmentTime;
            return this;
        }
        public Long getAppointmentTime() {
            return this.appointmentTime;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setCommodityDesc(String commodityDesc) {
            this.commodityDesc = commodityDesc;
            return this;
        }
        public String getCommodityDesc() {
            return this.commodityDesc;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setCreatorEmpId(String creatorEmpId) {
            this.creatorEmpId = creatorEmpId;
            return this;
        }
        public String getCreatorEmpId() {
            return this.creatorEmpId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setCycleService(Boolean cycleService) {
            this.cycleService = cycleService;
            return this;
        }
        public Boolean getCycleService() {
            return this.cycleService;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setExtList(java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksExtList> extList) {
            this.extList = extList;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksExtList> getExtList() {
            return this.extList;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setMergeSolutionAndReporterOneStep(Boolean mergeSolutionAndReporterOneStep) {
            this.mergeSolutionAndReporterOneStep = mergeSolutionAndReporterOneStep;
            return this;
        }
        public Boolean getMergeSolutionAndReporterOneStep() {
            return this.mergeSolutionAndReporterOneStep;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setModifierEmpId(String modifierEmpId) {
            this.modifierEmpId = modifierEmpId;
            return this;
        }
        public String getModifierEmpId() {
            return this.modifierEmpId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setNtmCommodityCode(String ntmCommodityCode) {
            this.ntmCommodityCode = ntmCommodityCode;
            return this;
        }
        public String getNtmCommodityCode() {
            return this.ntmCommodityCode;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setOrderDetail(Object orderDetail) {
            this.orderDetail = orderDetail;
            return this;
        }
        public Object getOrderDetail() {
            return this.orderDetail;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setPerformanceNodeDTOS(java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksPerformanceNodeDTOS> performanceNodeDTOS) {
            this.performanceNodeDTOS = performanceNodeDTOS;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksPerformanceNodeDTOS> getPerformanceNodeDTOS() {
            return this.performanceNodeDTOS;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setPurchasePackCode(Integer purchasePackCode) {
            this.purchasePackCode = purchasePackCode;
            return this;
        }
        public Integer getPurchasePackCode() {
            return this.purchasePackCode;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setServiceMonthReports(java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceMonthReports> serviceMonthReports) {
            this.serviceMonthReports = serviceMonthReports;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceMonthReports> getServiceMonthReports() {
            return this.serviceMonthReports;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setServiceReports(java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceReports> serviceReports) {
            this.serviceReports = serviceReports;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceReports> getServiceReports() {
            return this.serviceReports;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setServiceSchemes(java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceSchemes> serviceSchemes) {
            this.serviceSchemes = serviceSchemes;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksServiceSchemes> getServiceSchemes() {
            return this.serviceSchemes;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setStatusStr(String statusStr) {
            this.statusStr = statusStr;
            return this;
        }
        public String getStatusStr() {
            return this.statusStr;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setSupportTime(java.util.List<Long> supportTime) {
            this.supportTime = supportTime;
            return this;
        }
        public java.util.List<Long> getSupportTime() {
            return this.supportTime;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks setTamEngineers(java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksTamEngineers> tamEngineers) {
            this.tamEngineers = tamEngineers;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacksTamEngineers> getTamEngineers() {
            return this.tamEngineers;
        }

    }

    public static class ListServiceApplyResponseBodyDataListPerformanceOrdersServiceMonthReports extends TeaModel {
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

        public static ListServiceApplyResponseBodyDataListPerformanceOrdersServiceMonthReports build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataListPerformanceOrdersServiceMonthReports self = new ListServiceApplyResponseBodyDataListPerformanceOrdersServiceMonthReports();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceMonthReports setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceMonthReports setBatchGroup(String batchGroup) {
            this.batchGroup = batchGroup;
            return this;
        }
        public String getBatchGroup() {
            return this.batchGroup;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceMonthReports setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceMonthReports setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceMonthReports setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceMonthReports setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceMonthReports setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceMonthReports setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceMonthReports setRemarke(String remarke) {
            this.remarke = remarke;
            return this;
        }
        public String getRemarke() {
            return this.remarke;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceMonthReports setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceMonthReports setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceMonthReports setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListServiceApplyResponseBodyDataListPerformanceOrdersServiceReports extends TeaModel {
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

        public static ListServiceApplyResponseBodyDataListPerformanceOrdersServiceReports build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataListPerformanceOrdersServiceReports self = new ListServiceApplyResponseBodyDataListPerformanceOrdersServiceReports();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceReports setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceReports setBatchGroup(String batchGroup) {
            this.batchGroup = batchGroup;
            return this;
        }
        public String getBatchGroup() {
            return this.batchGroup;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceReports setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceReports setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceReports setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceReports setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceReports setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceReports setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceReports setRemarke(String remarke) {
            this.remarke = remarke;
            return this;
        }
        public String getRemarke() {
            return this.remarke;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceReports setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceReports setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceReports setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListServiceApplyResponseBodyDataListPerformanceOrdersServiceSchemes extends TeaModel {
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

        public static ListServiceApplyResponseBodyDataListPerformanceOrdersServiceSchemes build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataListPerformanceOrdersServiceSchemes self = new ListServiceApplyResponseBodyDataListPerformanceOrdersServiceSchemes();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceSchemes setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceSchemes setBatchGroup(String batchGroup) {
            this.batchGroup = batchGroup;
            return this;
        }
        public String getBatchGroup() {
            return this.batchGroup;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceSchemes setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceSchemes setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceSchemes setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceSchemes setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceSchemes setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceSchemes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceSchemes setRemarke(String remarke) {
            this.remarke = remarke;
            return this;
        }
        public String getRemarke() {
            return this.remarke;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceSchemes setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceSchemes setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersServiceSchemes setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListServiceApplyResponseBodyDataListPerformanceOrdersTamEngineers extends TeaModel {
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

        public static ListServiceApplyResponseBodyDataListPerformanceOrdersTamEngineers build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataListPerformanceOrdersTamEngineers self = new ListServiceApplyResponseBodyDataListPerformanceOrdersTamEngineers();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersTamEngineers setCreatorEmpId(String creatorEmpId) {
            this.creatorEmpId = creatorEmpId;
            return this;
        }
        public String getCreatorEmpId() {
            return this.creatorEmpId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersTamEngineers setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersTamEngineers setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersTamEngineers setHrStatus(String hrStatus) {
            this.hrStatus = hrStatus;
            return this;
        }
        public String getHrStatus() {
            return this.hrStatus;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersTamEngineers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersTamEngineers setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersTamEngineers setModifierEmpId(String modifierEmpId) {
            this.modifierEmpId = modifierEmpId;
            return this;
        }
        public String getModifierEmpId() {
            return this.modifierEmpId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersTamEngineers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersTamEngineers setNickNameEn(String nickNameEn) {
            this.nickNameEn = nickNameEn;
            return this;
        }
        public String getNickNameEn() {
            return this.nickNameEn;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersTamEngineers setRealmId(Long realmId) {
            this.realmId = realmId;
            return this;
        }
        public Long getRealmId() {
            return this.realmId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrdersTamEngineers setWorkid(String workid) {
            this.workid = workid;
            return this;
        }
        public String getWorkid() {
            return this.workid;
        }

    }

    public static class ListServiceApplyResponseBodyDataListPerformanceOrders extends TeaModel {
        @NameInMap("applyFileVOList")
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersApplyFileVOList> applyFileVOList;

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
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersExtList> extList;

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

        @NameInMap("ntmCommodityCode")
        public String ntmCommodityCode;

        @NameInMap("orderDetail")
        public Object orderDetail;

        @NameInMap("orderId")
        public Long orderId;

        @NameInMap("packCount")
        public Integer packCount;

        @NameInMap("packDetails")
        public java.util.List<java.util.Map<String, ?>> packDetails;

        @NameInMap("performanceNodeDTOS")
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersPerformanceNodeDTOS> performanceNodeDTOS;

        @NameInMap("performancePacks")
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks> performancePacks;

        @NameInMap("purchasePackCode")
        public Integer purchasePackCode;

        @NameInMap("serviceApplyId")
        public Long serviceApplyId;

        @NameInMap("serviceMonthReports")
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersServiceMonthReports> serviceMonthReports;

        @NameInMap("serviceReports")
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersServiceReports> serviceReports;

        @NameInMap("serviceSchemes")
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersServiceSchemes> serviceSchemes;

        @NameInMap("status")
        public Integer status;

        @NameInMap("statusStr")
        public String statusStr;

        @NameInMap("supportTime")
        public java.util.List<Long> supportTime;

        @NameInMap("tamEngineers")
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersTamEngineers> tamEngineers;

        public static ListServiceApplyResponseBodyDataListPerformanceOrders build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataListPerformanceOrders self = new ListServiceApplyResponseBodyDataListPerformanceOrders();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setApplyFileVOList(java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersApplyFileVOList> applyFileVOList) {
            this.applyFileVOList = applyFileVOList;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersApplyFileVOList> getApplyFileVOList() {
            return this.applyFileVOList;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setAppointmentCode(String appointmentCode) {
            this.appointmentCode = appointmentCode;
            return this;
        }
        public String getAppointmentCode() {
            return this.appointmentCode;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setAppointmentEndTime(Long appointmentEndTime) {
            this.appointmentEndTime = appointmentEndTime;
            return this;
        }
        public Long getAppointmentEndTime() {
            return this.appointmentEndTime;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setAppointmentPassTime(Long appointmentPassTime) {
            this.appointmentPassTime = appointmentPassTime;
            return this;
        }
        public Long getAppointmentPassTime() {
            return this.appointmentPassTime;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setAppointmentTime(Long appointmentTime) {
            this.appointmentTime = appointmentTime;
            return this;
        }
        public Long getAppointmentTime() {
            return this.appointmentTime;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setCommodityDesc(String commodityDesc) {
            this.commodityDesc = commodityDesc;
            return this;
        }
        public String getCommodityDesc() {
            return this.commodityDesc;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setCreatorEmpId(String creatorEmpId) {
            this.creatorEmpId = creatorEmpId;
            return this;
        }
        public String getCreatorEmpId() {
            return this.creatorEmpId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setCycleService(Boolean cycleService) {
            this.cycleService = cycleService;
            return this;
        }
        public Boolean getCycleService() {
            return this.cycleService;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setExtList(java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersExtList> extList) {
            this.extList = extList;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersExtList> getExtList() {
            return this.extList;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setMergeSolutionAndReporterOneStep(Boolean mergeSolutionAndReporterOneStep) {
            this.mergeSolutionAndReporterOneStep = mergeSolutionAndReporterOneStep;
            return this;
        }
        public Boolean getMergeSolutionAndReporterOneStep() {
            return this.mergeSolutionAndReporterOneStep;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setModifierEmpId(String modifierEmpId) {
            this.modifierEmpId = modifierEmpId;
            return this;
        }
        public String getModifierEmpId() {
            return this.modifierEmpId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setNtmCommodityCode(String ntmCommodityCode) {
            this.ntmCommodityCode = ntmCommodityCode;
            return this;
        }
        public String getNtmCommodityCode() {
            return this.ntmCommodityCode;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setOrderDetail(Object orderDetail) {
            this.orderDetail = orderDetail;
            return this;
        }
        public Object getOrderDetail() {
            return this.orderDetail;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setPackCount(Integer packCount) {
            this.packCount = packCount;
            return this;
        }
        public Integer getPackCount() {
            return this.packCount;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setPackDetails(java.util.List<java.util.Map<String, ?>> packDetails) {
            this.packDetails = packDetails;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getPackDetails() {
            return this.packDetails;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setPerformanceNodeDTOS(java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersPerformanceNodeDTOS> performanceNodeDTOS) {
            this.performanceNodeDTOS = performanceNodeDTOS;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersPerformanceNodeDTOS> getPerformanceNodeDTOS() {
            return this.performanceNodeDTOS;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setPerformancePacks(java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks> performancePacks) {
            this.performancePacks = performancePacks;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersPerformancePacks> getPerformancePacks() {
            return this.performancePacks;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setPurchasePackCode(Integer purchasePackCode) {
            this.purchasePackCode = purchasePackCode;
            return this;
        }
        public Integer getPurchasePackCode() {
            return this.purchasePackCode;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setServiceMonthReports(java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersServiceMonthReports> serviceMonthReports) {
            this.serviceMonthReports = serviceMonthReports;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersServiceMonthReports> getServiceMonthReports() {
            return this.serviceMonthReports;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setServiceReports(java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersServiceReports> serviceReports) {
            this.serviceReports = serviceReports;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersServiceReports> getServiceReports() {
            return this.serviceReports;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setServiceSchemes(java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersServiceSchemes> serviceSchemes) {
            this.serviceSchemes = serviceSchemes;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersServiceSchemes> getServiceSchemes() {
            return this.serviceSchemes;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setStatusStr(String statusStr) {
            this.statusStr = statusStr;
            return this;
        }
        public String getStatusStr() {
            return this.statusStr;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setSupportTime(java.util.List<Long> supportTime) {
            this.supportTime = supportTime;
            return this;
        }
        public java.util.List<Long> getSupportTime() {
            return this.supportTime;
        }

        public ListServiceApplyResponseBodyDataListPerformanceOrders setTamEngineers(java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersTamEngineers> tamEngineers) {
            this.tamEngineers = tamEngineers;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrdersTamEngineers> getTamEngineers() {
            return this.tamEngineers;
        }

    }

    public static class ListServiceApplyResponseBodyDataListPerformancePacksApplyFileVOList extends TeaModel {
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

        public static ListServiceApplyResponseBodyDataListPerformancePacksApplyFileVOList build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataListPerformancePacksApplyFileVOList self = new ListServiceApplyResponseBodyDataListPerformancePacksApplyFileVOList();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksApplyFileVOList setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksApplyFileVOList setBatchGroup(String batchGroup) {
            this.batchGroup = batchGroup;
            return this;
        }
        public String getBatchGroup() {
            return this.batchGroup;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksApplyFileVOList setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksApplyFileVOList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksApplyFileVOList setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksApplyFileVOList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksApplyFileVOList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksApplyFileVOList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksApplyFileVOList setRemarke(String remarke) {
            this.remarke = remarke;
            return this;
        }
        public String getRemarke() {
            return this.remarke;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksApplyFileVOList setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksApplyFileVOList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksApplyFileVOList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListServiceApplyResponseBodyDataListPerformancePacksExtList extends TeaModel {
        @NameInMap("keyCode")
        public String keyCode;

        @NameInMap("name")
        public String name;

        @NameInMap("value")
        public Object value;

        @NameInMap("view")
        public String view;

        public static ListServiceApplyResponseBodyDataListPerformancePacksExtList build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataListPerformancePacksExtList self = new ListServiceApplyResponseBodyDataListPerformancePacksExtList();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksExtList setKeyCode(String keyCode) {
            this.keyCode = keyCode;
            return this;
        }
        public String getKeyCode() {
            return this.keyCode;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksExtList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksExtList setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksExtList setView(String view) {
            this.view = view;
            return this;
        }
        public String getView() {
            return this.view;
        }

    }

    public static class ListServiceApplyResponseBodyDataListPerformancePacksPerformanceNodeDTOS extends TeaModel {
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

        public static ListServiceApplyResponseBodyDataListPerformancePacksPerformanceNodeDTOS build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataListPerformancePacksPerformanceNodeDTOS self = new ListServiceApplyResponseBodyDataListPerformancePacksPerformanceNodeDTOS();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksPerformanceNodeDTOS setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksPerformanceNodeDTOS setExtendInfo(Object extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public Object getExtendInfo() {
            return this.extendInfo;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksPerformanceNodeDTOS setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksPerformanceNodeDTOS setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksPerformanceNodeDTOS setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class ListServiceApplyResponseBodyDataListPerformancePacksServiceMonthReports extends TeaModel {
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

        public static ListServiceApplyResponseBodyDataListPerformancePacksServiceMonthReports build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataListPerformancePacksServiceMonthReports self = new ListServiceApplyResponseBodyDataListPerformancePacksServiceMonthReports();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceMonthReports setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceMonthReports setBatchGroup(String batchGroup) {
            this.batchGroup = batchGroup;
            return this;
        }
        public String getBatchGroup() {
            return this.batchGroup;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceMonthReports setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceMonthReports setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceMonthReports setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceMonthReports setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceMonthReports setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceMonthReports setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceMonthReports setRemarke(String remarke) {
            this.remarke = remarke;
            return this;
        }
        public String getRemarke() {
            return this.remarke;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceMonthReports setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceMonthReports setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceMonthReports setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListServiceApplyResponseBodyDataListPerformancePacksServiceReports extends TeaModel {
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

        public static ListServiceApplyResponseBodyDataListPerformancePacksServiceReports build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataListPerformancePacksServiceReports self = new ListServiceApplyResponseBodyDataListPerformancePacksServiceReports();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceReports setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceReports setBatchGroup(String batchGroup) {
            this.batchGroup = batchGroup;
            return this;
        }
        public String getBatchGroup() {
            return this.batchGroup;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceReports setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceReports setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceReports setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceReports setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceReports setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceReports setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceReports setRemarke(String remarke) {
            this.remarke = remarke;
            return this;
        }
        public String getRemarke() {
            return this.remarke;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceReports setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceReports setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceReports setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListServiceApplyResponseBodyDataListPerformancePacksServiceSchemes extends TeaModel {
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

        public static ListServiceApplyResponseBodyDataListPerformancePacksServiceSchemes build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataListPerformancePacksServiceSchemes self = new ListServiceApplyResponseBodyDataListPerformancePacksServiceSchemes();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceSchemes setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceSchemes setBatchGroup(String batchGroup) {
            this.batchGroup = batchGroup;
            return this;
        }
        public String getBatchGroup() {
            return this.batchGroup;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceSchemes setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceSchemes setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceSchemes setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceSchemes setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceSchemes setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceSchemes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceSchemes setRemarke(String remarke) {
            this.remarke = remarke;
            return this;
        }
        public String getRemarke() {
            return this.remarke;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceSchemes setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceSchemes setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksServiceSchemes setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListServiceApplyResponseBodyDataListPerformancePacksTamEngineers extends TeaModel {
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

        public static ListServiceApplyResponseBodyDataListPerformancePacksTamEngineers build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataListPerformancePacksTamEngineers self = new ListServiceApplyResponseBodyDataListPerformancePacksTamEngineers();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksTamEngineers setCreatorEmpId(String creatorEmpId) {
            this.creatorEmpId = creatorEmpId;
            return this;
        }
        public String getCreatorEmpId() {
            return this.creatorEmpId;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksTamEngineers setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksTamEngineers setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksTamEngineers setHrStatus(String hrStatus) {
            this.hrStatus = hrStatus;
            return this;
        }
        public String getHrStatus() {
            return this.hrStatus;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksTamEngineers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksTamEngineers setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksTamEngineers setModifierEmpId(String modifierEmpId) {
            this.modifierEmpId = modifierEmpId;
            return this;
        }
        public String getModifierEmpId() {
            return this.modifierEmpId;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksTamEngineers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksTamEngineers setNickNameEn(String nickNameEn) {
            this.nickNameEn = nickNameEn;
            return this;
        }
        public String getNickNameEn() {
            return this.nickNameEn;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksTamEngineers setRealmId(Long realmId) {
            this.realmId = realmId;
            return this;
        }
        public Long getRealmId() {
            return this.realmId;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacksTamEngineers setWorkid(String workid) {
            this.workid = workid;
            return this;
        }
        public String getWorkid() {
            return this.workid;
        }

    }

    public static class ListServiceApplyResponseBodyDataListPerformancePacks extends TeaModel {
        @NameInMap("applyFileVOList")
        public java.util.List<ListServiceApplyResponseBodyDataListPerformancePacksApplyFileVOList> applyFileVOList;

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
        public java.util.List<ListServiceApplyResponseBodyDataListPerformancePacksExtList> extList;

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

        @NameInMap("ntmCommodityCode")
        public String ntmCommodityCode;

        @NameInMap("orderDetail")
        public Object orderDetail;

        @NameInMap("orderId")
        public Long orderId;

        @NameInMap("performanceNodeDTOS")
        public java.util.List<ListServiceApplyResponseBodyDataListPerformancePacksPerformanceNodeDTOS> performanceNodeDTOS;

        @NameInMap("purchasePackCode")
        public Integer purchasePackCode;

        @NameInMap("serviceApplyId")
        public Long serviceApplyId;

        @NameInMap("serviceMonthReports")
        public java.util.List<ListServiceApplyResponseBodyDataListPerformancePacksServiceMonthReports> serviceMonthReports;

        @NameInMap("serviceReports")
        public java.util.List<ListServiceApplyResponseBodyDataListPerformancePacksServiceReports> serviceReports;

        @NameInMap("serviceSchemes")
        public java.util.List<ListServiceApplyResponseBodyDataListPerformancePacksServiceSchemes> serviceSchemes;

        @NameInMap("status")
        public Integer status;

        @NameInMap("statusStr")
        public String statusStr;

        @NameInMap("supportTime")
        public java.util.List<Long> supportTime;

        @NameInMap("tamEngineers")
        public java.util.List<ListServiceApplyResponseBodyDataListPerformancePacksTamEngineers> tamEngineers;

        public static ListServiceApplyResponseBodyDataListPerformancePacks build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataListPerformancePacks self = new ListServiceApplyResponseBodyDataListPerformancePacks();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setApplyFileVOList(java.util.List<ListServiceApplyResponseBodyDataListPerformancePacksApplyFileVOList> applyFileVOList) {
            this.applyFileVOList = applyFileVOList;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataListPerformancePacksApplyFileVOList> getApplyFileVOList() {
            return this.applyFileVOList;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setAppointmentCode(String appointmentCode) {
            this.appointmentCode = appointmentCode;
            return this;
        }
        public String getAppointmentCode() {
            return this.appointmentCode;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setAppointmentEndTime(Long appointmentEndTime) {
            this.appointmentEndTime = appointmentEndTime;
            return this;
        }
        public Long getAppointmentEndTime() {
            return this.appointmentEndTime;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setAppointmentPassTime(Long appointmentPassTime) {
            this.appointmentPassTime = appointmentPassTime;
            return this;
        }
        public Long getAppointmentPassTime() {
            return this.appointmentPassTime;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setAppointmentTime(Long appointmentTime) {
            this.appointmentTime = appointmentTime;
            return this;
        }
        public Long getAppointmentTime() {
            return this.appointmentTime;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setCommodityDesc(String commodityDesc) {
            this.commodityDesc = commodityDesc;
            return this;
        }
        public String getCommodityDesc() {
            return this.commodityDesc;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setCreatorEmpId(String creatorEmpId) {
            this.creatorEmpId = creatorEmpId;
            return this;
        }
        public String getCreatorEmpId() {
            return this.creatorEmpId;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setCycleService(Boolean cycleService) {
            this.cycleService = cycleService;
            return this;
        }
        public Boolean getCycleService() {
            return this.cycleService;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setExtList(java.util.List<ListServiceApplyResponseBodyDataListPerformancePacksExtList> extList) {
            this.extList = extList;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataListPerformancePacksExtList> getExtList() {
            return this.extList;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setMergeSolutionAndReporterOneStep(Boolean mergeSolutionAndReporterOneStep) {
            this.mergeSolutionAndReporterOneStep = mergeSolutionAndReporterOneStep;
            return this;
        }
        public Boolean getMergeSolutionAndReporterOneStep() {
            return this.mergeSolutionAndReporterOneStep;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setModifierEmpId(String modifierEmpId) {
            this.modifierEmpId = modifierEmpId;
            return this;
        }
        public String getModifierEmpId() {
            return this.modifierEmpId;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setNtmCommodityCode(String ntmCommodityCode) {
            this.ntmCommodityCode = ntmCommodityCode;
            return this;
        }
        public String getNtmCommodityCode() {
            return this.ntmCommodityCode;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setOrderDetail(Object orderDetail) {
            this.orderDetail = orderDetail;
            return this;
        }
        public Object getOrderDetail() {
            return this.orderDetail;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setPerformanceNodeDTOS(java.util.List<ListServiceApplyResponseBodyDataListPerformancePacksPerformanceNodeDTOS> performanceNodeDTOS) {
            this.performanceNodeDTOS = performanceNodeDTOS;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataListPerformancePacksPerformanceNodeDTOS> getPerformanceNodeDTOS() {
            return this.performanceNodeDTOS;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setPurchasePackCode(Integer purchasePackCode) {
            this.purchasePackCode = purchasePackCode;
            return this;
        }
        public Integer getPurchasePackCode() {
            return this.purchasePackCode;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setServiceMonthReports(java.util.List<ListServiceApplyResponseBodyDataListPerformancePacksServiceMonthReports> serviceMonthReports) {
            this.serviceMonthReports = serviceMonthReports;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataListPerformancePacksServiceMonthReports> getServiceMonthReports() {
            return this.serviceMonthReports;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setServiceReports(java.util.List<ListServiceApplyResponseBodyDataListPerformancePacksServiceReports> serviceReports) {
            this.serviceReports = serviceReports;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataListPerformancePacksServiceReports> getServiceReports() {
            return this.serviceReports;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setServiceSchemes(java.util.List<ListServiceApplyResponseBodyDataListPerformancePacksServiceSchemes> serviceSchemes) {
            this.serviceSchemes = serviceSchemes;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataListPerformancePacksServiceSchemes> getServiceSchemes() {
            return this.serviceSchemes;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setStatusStr(String statusStr) {
            this.statusStr = statusStr;
            return this;
        }
        public String getStatusStr() {
            return this.statusStr;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setSupportTime(java.util.List<Long> supportTime) {
            this.supportTime = supportTime;
            return this;
        }
        public java.util.List<Long> getSupportTime() {
            return this.supportTime;
        }

        public ListServiceApplyResponseBodyDataListPerformancePacks setTamEngineers(java.util.List<ListServiceApplyResponseBodyDataListPerformancePacksTamEngineers> tamEngineers) {
            this.tamEngineers = tamEngineers;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataListPerformancePacksTamEngineers> getTamEngineers() {
            return this.tamEngineers;
        }

    }

    public static class ListServiceApplyResponseBodyDataListServiceReports extends TeaModel {
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

        public static ListServiceApplyResponseBodyDataListServiceReports build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataListServiceReports self = new ListServiceApplyResponseBodyDataListServiceReports();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataListServiceReports setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }
        public String getAppointmentId() {
            return this.appointmentId;
        }

        public ListServiceApplyResponseBodyDataListServiceReports setBatchGroup(String batchGroup) {
            this.batchGroup = batchGroup;
            return this;
        }
        public String getBatchGroup() {
            return this.batchGroup;
        }

        public ListServiceApplyResponseBodyDataListServiceReports setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public ListServiceApplyResponseBodyDataListServiceReports setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListServiceApplyResponseBodyDataListServiceReports setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public ListServiceApplyResponseBodyDataListServiceReports setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListServiceApplyResponseBodyDataListServiceReports setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListServiceApplyResponseBodyDataListServiceReports setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListServiceApplyResponseBodyDataListServiceReports setRemarke(String remarke) {
            this.remarke = remarke;
            return this;
        }
        public String getRemarke() {
            return this.remarke;
        }

        public ListServiceApplyResponseBodyDataListServiceReports setServiceApplyId(Long serviceApplyId) {
            this.serviceApplyId = serviceApplyId;
            return this;
        }
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        public ListServiceApplyResponseBodyDataListServiceReports setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListServiceApplyResponseBodyDataListServiceReports setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListServiceApplyResponseBodyDataList extends TeaModel {
        @NameInMap("applierId")
        public String applierId;

        @NameInMap("applyCode")
        public String applyCode;

        @NameInMap("applyComponentDetails")
        public java.util.List<java.util.List<String>> applyComponentDetails;

        @NameInMap("applyTime")
        public Long applyTime;

        @NameInMap("appointments")
        public java.util.List<ListServiceApplyResponseBodyDataListAppointments> appointments;

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
        public java.util.List<ListServiceApplyResponseBodyDataListPayOrders> payOrders;

        @NameInMap("payUrl")
        public String payUrl;

        @NameInMap("performanceOrders")
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrders> performanceOrders;

        @NameInMap("performancePacks")
        public java.util.List<ListServiceApplyResponseBodyDataListPerformancePacks> performancePacks;

        @NameInMap("reneWalUrl")
        public String reneWalUrl;

        @NameInMap("serviceCode")
        public String serviceCode;

        @NameInMap("serviceName")
        public String serviceName;

        @NameInMap("serviceReports")
        public java.util.List<ListServiceApplyResponseBodyDataListServiceReports> serviceReports;

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

        public static ListServiceApplyResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyDataList self = new ListServiceApplyResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyDataList setApplierId(String applierId) {
            this.applierId = applierId;
            return this;
        }
        public String getApplierId() {
            return this.applierId;
        }

        public ListServiceApplyResponseBodyDataList setApplyCode(String applyCode) {
            this.applyCode = applyCode;
            return this;
        }
        public String getApplyCode() {
            return this.applyCode;
        }

        public ListServiceApplyResponseBodyDataList setApplyComponentDetails(java.util.List<java.util.List<String>> applyComponentDetails) {
            this.applyComponentDetails = applyComponentDetails;
            return this;
        }
        public java.util.List<java.util.List<String>> getApplyComponentDetails() {
            return this.applyComponentDetails;
        }

        public ListServiceApplyResponseBodyDataList setApplyTime(Long applyTime) {
            this.applyTime = applyTime;
            return this;
        }
        public Long getApplyTime() {
            return this.applyTime;
        }

        public ListServiceApplyResponseBodyDataList setAppointments(java.util.List<ListServiceApplyResponseBodyDataListAppointments> appointments) {
            this.appointments = appointments;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataListAppointments> getAppointments() {
            return this.appointments;
        }

        public ListServiceApplyResponseBodyDataList setBuyUrl(String buyUrl) {
            this.buyUrl = buyUrl;
            return this;
        }
        public String getBuyUrl() {
            return this.buyUrl;
        }

        public ListServiceApplyResponseBodyDataList setCreatorEmpId(String creatorEmpId) {
            this.creatorEmpId = creatorEmpId;
            return this;
        }
        public String getCreatorEmpId() {
            return this.creatorEmpId;
        }

        public ListServiceApplyResponseBodyDataList setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public String getCustomerName() {
            return this.customerName;
        }

        public ListServiceApplyResponseBodyDataList setCycleService(Boolean cycleService) {
            this.cycleService = cycleService;
            return this;
        }
        public Boolean getCycleService() {
            return this.cycleService;
        }

        public ListServiceApplyResponseBodyDataList setExecutedCount(Long executedCount) {
            this.executedCount = executedCount;
            return this;
        }
        public Long getExecutedCount() {
            return this.executedCount;
        }

        public ListServiceApplyResponseBodyDataList setFinishCount(Long finishCount) {
            this.finishCount = finishCount;
            return this;
        }
        public Long getFinishCount() {
            return this.finishCount;
        }

        public ListServiceApplyResponseBodyDataList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListServiceApplyResponseBodyDataList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListServiceApplyResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListServiceApplyResponseBodyDataList setMergeSolutionAndReporterOneStep(Boolean mergeSolutionAndReporterOneStep) {
            this.mergeSolutionAndReporterOneStep = mergeSolutionAndReporterOneStep;
            return this;
        }
        public Boolean getMergeSolutionAndReporterOneStep() {
            return this.mergeSolutionAndReporterOneStep;
        }

        public ListServiceApplyResponseBodyDataList setModifierEmpId(String modifierEmpId) {
            this.modifierEmpId = modifierEmpId;
            return this;
        }
        public String getModifierEmpId() {
            return this.modifierEmpId;
        }

        public ListServiceApplyResponseBodyDataList setPackDetails(java.util.List<java.util.Map<String, ?>> packDetails) {
            this.packDetails = packDetails;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getPackDetails() {
            return this.packDetails;
        }

        public ListServiceApplyResponseBodyDataList setPayOrders(java.util.List<ListServiceApplyResponseBodyDataListPayOrders> payOrders) {
            this.payOrders = payOrders;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataListPayOrders> getPayOrders() {
            return this.payOrders;
        }

        public ListServiceApplyResponseBodyDataList setPayUrl(String payUrl) {
            this.payUrl = payUrl;
            return this;
        }
        public String getPayUrl() {
            return this.payUrl;
        }

        public ListServiceApplyResponseBodyDataList setPerformanceOrders(java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrders> performanceOrders) {
            this.performanceOrders = performanceOrders;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataListPerformanceOrders> getPerformanceOrders() {
            return this.performanceOrders;
        }

        public ListServiceApplyResponseBodyDataList setPerformancePacks(java.util.List<ListServiceApplyResponseBodyDataListPerformancePacks> performancePacks) {
            this.performancePacks = performancePacks;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataListPerformancePacks> getPerformancePacks() {
            return this.performancePacks;
        }

        public ListServiceApplyResponseBodyDataList setReneWalUrl(String reneWalUrl) {
            this.reneWalUrl = reneWalUrl;
            return this;
        }
        public String getReneWalUrl() {
            return this.reneWalUrl;
        }

        public ListServiceApplyResponseBodyDataList setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public ListServiceApplyResponseBodyDataList setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListServiceApplyResponseBodyDataList setServiceReports(java.util.List<ListServiceApplyResponseBodyDataListServiceReports> serviceReports) {
            this.serviceReports = serviceReports;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataListServiceReports> getServiceReports() {
            return this.serviceReports;
        }

        public ListServiceApplyResponseBodyDataList setServiceTimeRange(java.util.List<Long> serviceTimeRange) {
            this.serviceTimeRange = serviceTimeRange;
            return this;
        }
        public java.util.List<Long> getServiceTimeRange() {
            return this.serviceTimeRange;
        }

        public ListServiceApplyResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListServiceApplyResponseBodyDataList setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Integer getStatusCode() {
            return this.statusCode;
        }

        public ListServiceApplyResponseBodyDataList setStatusStr(String statusStr) {
            this.statusStr = statusStr;
            return this;
        }
        public String getStatusStr() {
            return this.statusStr;
        }

        public ListServiceApplyResponseBodyDataList setTermOfValidity(String termOfValidity) {
            this.termOfValidity = termOfValidity;
            return this;
        }
        public String getTermOfValidity() {
            return this.termOfValidity;
        }

        public ListServiceApplyResponseBodyDataList setTotalPack(Integer totalPack) {
            this.totalPack = totalPack;
            return this;
        }
        public Integer getTotalPack() {
            return this.totalPack;
        }

        public ListServiceApplyResponseBodyDataList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListServiceApplyResponseBodyDataList setUsePack(Long usePack) {
            this.usePack = usePack;
            return this;
        }
        public Long getUsePack() {
            return this.usePack;
        }

    }

    public static class ListServiceApplyResponseBodyData extends TeaModel {
        @NameInMap("extend")
        public Object extend;

        @NameInMap("list")
        public java.util.List<ListServiceApplyResponseBodyDataList> list;

        @NameInMap("pageNum")
        public Integer pageNum;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("total")
        public Integer total;

        public static ListServiceApplyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListServiceApplyResponseBodyData self = new ListServiceApplyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListServiceApplyResponseBodyData setExtend(Object extend) {
            this.extend = extend;
            return this;
        }
        public Object getExtend() {
            return this.extend;
        }

        public ListServiceApplyResponseBodyData setList(java.util.List<ListServiceApplyResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListServiceApplyResponseBodyDataList> getList() {
            return this.list;
        }

        public ListServiceApplyResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListServiceApplyResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListServiceApplyResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
