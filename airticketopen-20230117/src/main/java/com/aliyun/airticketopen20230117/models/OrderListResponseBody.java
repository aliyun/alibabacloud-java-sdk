// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class OrderListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public OrderListResponseBodyData data;

    @NameInMap("error_code")
    public String errorCode;

    @NameInMap("error_data")
    public Object errorData;

    @NameInMap("error_msg")
    public String errorMsg;

    @NameInMap("status")
    public Integer status;

    @NameInMap("success")
    public Boolean success;

    public static OrderListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OrderListResponseBody self = new OrderListResponseBody();
        return TeaModel.build(map, self);
    }

    public OrderListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OrderListResponseBody setData(OrderListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OrderListResponseBodyData getData() {
        return this.data;
    }

    public OrderListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public OrderListResponseBody setErrorData(Object errorData) {
        this.errorData = errorData;
        return this;
    }
    public Object getErrorData() {
        return this.errorData;
    }

    public OrderListResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public OrderListResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public OrderListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class OrderListResponseBodyDataListPassengerListCredential extends TeaModel {
        @NameInMap("cert_issue_place")
        public String certIssuePlace;

        @NameInMap("credential_num")
        public String credentialNum;

        @NameInMap("credential_type")
        public Integer credentialType;

        @NameInMap("expire_date")
        public String expireDate;

        public static OrderListResponseBodyDataListPassengerListCredential build(java.util.Map<String, ?> map) throws Exception {
            OrderListResponseBodyDataListPassengerListCredential self = new OrderListResponseBodyDataListPassengerListCredential();
            return TeaModel.build(map, self);
        }

        public OrderListResponseBodyDataListPassengerListCredential setCertIssuePlace(String certIssuePlace) {
            this.certIssuePlace = certIssuePlace;
            return this;
        }
        public String getCertIssuePlace() {
            return this.certIssuePlace;
        }

        public OrderListResponseBodyDataListPassengerListCredential setCredentialNum(String credentialNum) {
            this.credentialNum = credentialNum;
            return this;
        }
        public String getCredentialNum() {
            return this.credentialNum;
        }

        public OrderListResponseBodyDataListPassengerListCredential setCredentialType(Integer credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public Integer getCredentialType() {
            return this.credentialType;
        }

        public OrderListResponseBodyDataListPassengerListCredential setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

    }

    public static class OrderListResponseBodyDataListPassengerList extends TeaModel {
        @NameInMap("birthday")
        public String birthday;

        @NameInMap("credential")
        public OrderListResponseBodyDataListPassengerListCredential credential;

        @NameInMap("first_name")
        public String firstName;

        @NameInMap("gender")
        public Integer gender;

        @NameInMap("last_name")
        public String lastName;

        @NameInMap("mobile_country_code")
        public String mobileCountryCode;

        @NameInMap("mobile_phone_number")
        public String mobilePhoneNumber;

        @NameInMap("nationality")
        public String nationality;

        @NameInMap("type")
        public Integer type;

        public static OrderListResponseBodyDataListPassengerList build(java.util.Map<String, ?> map) throws Exception {
            OrderListResponseBodyDataListPassengerList self = new OrderListResponseBodyDataListPassengerList();
            return TeaModel.build(map, self);
        }

        public OrderListResponseBodyDataListPassengerList setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public String getBirthday() {
            return this.birthday;
        }

        public OrderListResponseBodyDataListPassengerList setCredential(OrderListResponseBodyDataListPassengerListCredential credential) {
            this.credential = credential;
            return this;
        }
        public OrderListResponseBodyDataListPassengerListCredential getCredential() {
            return this.credential;
        }

        public OrderListResponseBodyDataListPassengerList setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public OrderListResponseBodyDataListPassengerList setGender(Integer gender) {
            this.gender = gender;
            return this;
        }
        public Integer getGender() {
            return this.gender;
        }

        public OrderListResponseBodyDataListPassengerList setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public OrderListResponseBodyDataListPassengerList setMobileCountryCode(String mobileCountryCode) {
            this.mobileCountryCode = mobileCountryCode;
            return this;
        }
        public String getMobileCountryCode() {
            return this.mobileCountryCode;
        }

        public OrderListResponseBodyDataListPassengerList setMobilePhoneNumber(String mobilePhoneNumber) {
            this.mobilePhoneNumber = mobilePhoneNumber;
            return this;
        }
        public String getMobilePhoneNumber() {
            return this.mobilePhoneNumber;
        }

        public OrderListResponseBodyDataListPassengerList setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public OrderListResponseBodyDataListPassengerList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class OrderListResponseBodyDataList extends TeaModel {
        @NameInMap("book_time")
        public Long bookTime;

        @NameInMap("order_num")
        public Long orderNum;

        @NameInMap("order_status")
        public String orderStatus;

        @NameInMap("out_order_num")
        public String outOrderNum;

        @NameInMap("passenger_list")
        public java.util.List<OrderListResponseBodyDataListPassengerList> passengerList;

        @NameInMap("pay_status")
        public String payStatus;

        @NameInMap("pay_time")
        public Long payTime;

        @NameInMap("promotion_price")
        public Double promotionPrice;

        @NameInMap("real_pay_price")
        public Double realPayPrice;

        @NameInMap("session_nick")
        public String sessionNick;

        @NameInMap("succeed_time")
        public Long succeedTime;

        @NameInMap("total_price")
        public Double totalPrice;

        @NameInMap("transaction_no")
        public String transactionNo;

        public static OrderListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            OrderListResponseBodyDataList self = new OrderListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public OrderListResponseBodyDataList setBookTime(Long bookTime) {
            this.bookTime = bookTime;
            return this;
        }
        public Long getBookTime() {
            return this.bookTime;
        }

        public OrderListResponseBodyDataList setOrderNum(Long orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Long getOrderNum() {
            return this.orderNum;
        }

        public OrderListResponseBodyDataList setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public String getOrderStatus() {
            return this.orderStatus;
        }

        public OrderListResponseBodyDataList setOutOrderNum(String outOrderNum) {
            this.outOrderNum = outOrderNum;
            return this;
        }
        public String getOutOrderNum() {
            return this.outOrderNum;
        }

        public OrderListResponseBodyDataList setPassengerList(java.util.List<OrderListResponseBodyDataListPassengerList> passengerList) {
            this.passengerList = passengerList;
            return this;
        }
        public java.util.List<OrderListResponseBodyDataListPassengerList> getPassengerList() {
            return this.passengerList;
        }

        public OrderListResponseBodyDataList setPayStatus(String payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public String getPayStatus() {
            return this.payStatus;
        }

        public OrderListResponseBodyDataList setPayTime(Long payTime) {
            this.payTime = payTime;
            return this;
        }
        public Long getPayTime() {
            return this.payTime;
        }

        public OrderListResponseBodyDataList setPromotionPrice(Double promotionPrice) {
            this.promotionPrice = promotionPrice;
            return this;
        }
        public Double getPromotionPrice() {
            return this.promotionPrice;
        }

        public OrderListResponseBodyDataList setRealPayPrice(Double realPayPrice) {
            this.realPayPrice = realPayPrice;
            return this;
        }
        public Double getRealPayPrice() {
            return this.realPayPrice;
        }

        public OrderListResponseBodyDataList setSessionNick(String sessionNick) {
            this.sessionNick = sessionNick;
            return this;
        }
        public String getSessionNick() {
            return this.sessionNick;
        }

        public OrderListResponseBodyDataList setSucceedTime(Long succeedTime) {
            this.succeedTime = succeedTime;
            return this;
        }
        public Long getSucceedTime() {
            return this.succeedTime;
        }

        public OrderListResponseBodyDataList setTotalPrice(Double totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Double getTotalPrice() {
            return this.totalPrice;
        }

        public OrderListResponseBodyDataList setTransactionNo(String transactionNo) {
            this.transactionNo = transactionNo;
            return this;
        }
        public String getTransactionNo() {
            return this.transactionNo;
        }

    }

    public static class OrderListResponseBodyDataPagination extends TeaModel {
        @NameInMap("current_page")
        public Integer currentPage;

        @NameInMap("page_size")
        public Integer pageSize;

        @NameInMap("total_count")
        public Integer totalCount;

        @NameInMap("total_page")
        public Integer totalPage;

        public static OrderListResponseBodyDataPagination build(java.util.Map<String, ?> map) throws Exception {
            OrderListResponseBodyDataPagination self = new OrderListResponseBodyDataPagination();
            return TeaModel.build(map, self);
        }

        public OrderListResponseBodyDataPagination setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public OrderListResponseBodyDataPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public OrderListResponseBodyDataPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public OrderListResponseBodyDataPagination setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

    public static class OrderListResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<OrderListResponseBodyDataList> list;

        @NameInMap("pagination")
        public OrderListResponseBodyDataPagination pagination;

        public static OrderListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OrderListResponseBodyData self = new OrderListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OrderListResponseBodyData setList(java.util.List<OrderListResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<OrderListResponseBodyDataList> getList() {
            return this.list;
        }

        public OrderListResponseBodyData setPagination(OrderListResponseBodyDataPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public OrderListResponseBodyDataPagination getPagination() {
            return this.pagination;
        }

    }

}
