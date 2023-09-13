// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class ListOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListOrderResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("LocalizedMessage")
    public String localizedMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrderResponseBody self = new ListOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOrderResponseBody setData(ListOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListOrderResponseBodyData getData() {
        return this.data;
    }

    public ListOrderResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListOrderResponseBody setLocalizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
        return this;
    }
    public String getLocalizedMessage() {
        return this.localizedMessage;
    }

    public ListOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListOrderResponseBodyDataListDeliveryInfo extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("BuyerMessage")
        public String buyerMessage;

        @NameInMap("Mail")
        public String mail;

        @NameInMap("Receiver")
        public String receiver;

        @NameInMap("ZipCode")
        public String zipCode;

        public static ListOrderResponseBodyDataListDeliveryInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOrderResponseBodyDataListDeliveryInfo self = new ListOrderResponseBodyDataListDeliveryInfo();
            return TeaModel.build(map, self);
        }

        public ListOrderResponseBodyDataListDeliveryInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListOrderResponseBodyDataListDeliveryInfo setBuyerMessage(String buyerMessage) {
            this.buyerMessage = buyerMessage;
            return this;
        }
        public String getBuyerMessage() {
            return this.buyerMessage;
        }

        public ListOrderResponseBodyDataListDeliveryInfo setMail(String mail) {
            this.mail = mail;
            return this;
        }
        public String getMail() {
            return this.mail;
        }

        public ListOrderResponseBodyDataListDeliveryInfo setReceiver(String receiver) {
            this.receiver = receiver;
            return this;
        }
        public String getReceiver() {
            return this.receiver;
        }

        public ListOrderResponseBodyDataListDeliveryInfo setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }
        public String getZipCode() {
            return this.zipCode;
        }

    }

    public static class ListOrderResponseBodyDataList extends TeaModel {
        @NameInMap("AliFee")
        public String aliFee;

        @NameInMap("ApnName")
        public String apnName;

        @NameInMap("ApnRegion")
        public String apnRegion;

        @NameInMap("BillingCycle")
        public String billingCycle;

        @NameInMap("BuyNum")
        public Integer buyNum;

        @NameInMap("CardPayCount")
        public Integer cardPayCount;

        @NameInMap("CredentialNo")
        public String credentialNo;

        @NameInMap("CredentialPackage")
        public String credentialPackage;

        @NameInMap("DataLevel")
        public String dataLevel;

        @NameInMap("DeliveryInfo")
        public ListOrderResponseBodyDataListDeliveryInfo deliveryInfo;

        @NameInMap("ExpressNoList")
        public java.util.List<String> expressNoList;

        @NameInMap("FlowType")
        public String flowType;

        @NameInMap("FunctionFee")
        public Integer functionFee;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("OrderDetailUrl")
        public String orderDetailUrl;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("OrderInfo")
        public String orderInfo;

        @NameInMap("OrderStatus")
        public String orderStatus;

        @NameInMap("OrderType")
        public String orderType;

        @NameInMap("PayDuration")
        public String payDuration;

        @NameInMap("PayTime")
        public String payTime;

        @NameInMap("PoolCapacity")
        public String poolCapacity;

        @NameInMap("PoolCapacityUnit")
        public String poolCapacityUnit;

        @NameInMap("PoolNo")
        public String poolNo;

        @NameInMap("ResourceQuantity")
        public Long resourceQuantity;

        @NameInMap("Vendor")
        public String vendor;

        public static ListOrderResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListOrderResponseBodyDataList self = new ListOrderResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListOrderResponseBodyDataList setAliFee(String aliFee) {
            this.aliFee = aliFee;
            return this;
        }
        public String getAliFee() {
            return this.aliFee;
        }

        public ListOrderResponseBodyDataList setApnName(String apnName) {
            this.apnName = apnName;
            return this;
        }
        public String getApnName() {
            return this.apnName;
        }

        public ListOrderResponseBodyDataList setApnRegion(String apnRegion) {
            this.apnRegion = apnRegion;
            return this;
        }
        public String getApnRegion() {
            return this.apnRegion;
        }

        public ListOrderResponseBodyDataList setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public ListOrderResponseBodyDataList setBuyNum(Integer buyNum) {
            this.buyNum = buyNum;
            return this;
        }
        public Integer getBuyNum() {
            return this.buyNum;
        }

        public ListOrderResponseBodyDataList setCardPayCount(Integer cardPayCount) {
            this.cardPayCount = cardPayCount;
            return this;
        }
        public Integer getCardPayCount() {
            return this.cardPayCount;
        }

        public ListOrderResponseBodyDataList setCredentialNo(String credentialNo) {
            this.credentialNo = credentialNo;
            return this;
        }
        public String getCredentialNo() {
            return this.credentialNo;
        }

        public ListOrderResponseBodyDataList setCredentialPackage(String credentialPackage) {
            this.credentialPackage = credentialPackage;
            return this;
        }
        public String getCredentialPackage() {
            return this.credentialPackage;
        }

        public ListOrderResponseBodyDataList setDataLevel(String dataLevel) {
            this.dataLevel = dataLevel;
            return this;
        }
        public String getDataLevel() {
            return this.dataLevel;
        }

        public ListOrderResponseBodyDataList setDeliveryInfo(ListOrderResponseBodyDataListDeliveryInfo deliveryInfo) {
            this.deliveryInfo = deliveryInfo;
            return this;
        }
        public ListOrderResponseBodyDataListDeliveryInfo getDeliveryInfo() {
            return this.deliveryInfo;
        }

        public ListOrderResponseBodyDataList setExpressNoList(java.util.List<String> expressNoList) {
            this.expressNoList = expressNoList;
            return this;
        }
        public java.util.List<String> getExpressNoList() {
            return this.expressNoList;
        }

        public ListOrderResponseBodyDataList setFlowType(String flowType) {
            this.flowType = flowType;
            return this;
        }
        public String getFlowType() {
            return this.flowType;
        }

        public ListOrderResponseBodyDataList setFunctionFee(Integer functionFee) {
            this.functionFee = functionFee;
            return this;
        }
        public Integer getFunctionFee() {
            return this.functionFee;
        }

        public ListOrderResponseBodyDataList setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public ListOrderResponseBodyDataList setOrderDetailUrl(String orderDetailUrl) {
            this.orderDetailUrl = orderDetailUrl;
            return this;
        }
        public String getOrderDetailUrl() {
            return this.orderDetailUrl;
        }

        public ListOrderResponseBodyDataList setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public ListOrderResponseBodyDataList setOrderInfo(String orderInfo) {
            this.orderInfo = orderInfo;
            return this;
        }
        public String getOrderInfo() {
            return this.orderInfo;
        }

        public ListOrderResponseBodyDataList setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public String getOrderStatus() {
            return this.orderStatus;
        }

        public ListOrderResponseBodyDataList setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public ListOrderResponseBodyDataList setPayDuration(String payDuration) {
            this.payDuration = payDuration;
            return this;
        }
        public String getPayDuration() {
            return this.payDuration;
        }

        public ListOrderResponseBodyDataList setPayTime(String payTime) {
            this.payTime = payTime;
            return this;
        }
        public String getPayTime() {
            return this.payTime;
        }

        public ListOrderResponseBodyDataList setPoolCapacity(String poolCapacity) {
            this.poolCapacity = poolCapacity;
            return this;
        }
        public String getPoolCapacity() {
            return this.poolCapacity;
        }

        public ListOrderResponseBodyDataList setPoolCapacityUnit(String poolCapacityUnit) {
            this.poolCapacityUnit = poolCapacityUnit;
            return this;
        }
        public String getPoolCapacityUnit() {
            return this.poolCapacityUnit;
        }

        public ListOrderResponseBodyDataList setPoolNo(String poolNo) {
            this.poolNo = poolNo;
            return this;
        }
        public String getPoolNo() {
            return this.poolNo;
        }

        public ListOrderResponseBodyDataList setResourceQuantity(Long resourceQuantity) {
            this.resourceQuantity = resourceQuantity;
            return this;
        }
        public Long getResourceQuantity() {
            return this.resourceQuantity;
        }

        public ListOrderResponseBodyDataList setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

    public static class ListOrderResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListOrderResponseBodyDataList> list;

        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static ListOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOrderResponseBodyData self = new ListOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOrderResponseBodyData setList(java.util.List<ListOrderResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListOrderResponseBodyDataList> getList() {
            return this.list;
        }

        public ListOrderResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public ListOrderResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListOrderResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListOrderResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
