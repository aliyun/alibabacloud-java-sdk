// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class OrderListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The data returned for a successful request.</p>
     */
    @NameInMap("data")
    public OrderListResponseBodyData data;

    /**
     * <p>The business error code.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    /**
     * <p>The data returned with the error.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_data")
    public Object errorData;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_msg")
    public String errorMsg;

    /**
     * <p>The HTTP status code. The value is always 200 for successful requests.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The place of issue, represented as a two-letter code.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("cert_issue_place")
        public String certIssuePlace;

        /**
         * <p>The credential number.</p>
         * 
         * <strong>example:</strong>
         * <p>E1***5674</p>
         */
        @NameInMap("credential_num")
        public String credentialNum;

        /**
         * <p>The credential type. Valid values:</p>
         * <ul>
         * <li>0: ID card.</li>
         * <li>1: passport.</li>
         * <li>2: student ID.</li>
         * <li>3: military ID.</li>
         * <li>4: Home Return Permit.</li>
         * <li>5: Taiwan Compatriot Permit.</li>
         * <li>6: Hong Kong and Macao Travel Permit.</li>
         * <li>7: international seafarer certificate.</li>
         * <li>8: Foreigner Permanent Residence Card.</li>
         * <li>10: police officer ID.</li>
         * <li>11: soldier ID.</li>
         * <li>12: Taiwan Travel Permit.</li>
         * <li>13: Taiwan Entry Permit.</li>
         * <li>14: household register.</li>
         * <li>15: birth certificate.</li>
         * <li>16: driver license.</li>
         * <li>17: Hong Kong and Macao Resident Residence Permit.</li>
         * <li>18: Taiwan Resident Residence Permit.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("credential_type")
        public Integer credentialType;

        /**
         * <p>The credential expiration date.</p>
         * 
         * <strong>example:</strong>
         * <p>20290101</p>
         */
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
        /**
         * <p>The date of birth in the yyyyMMdd format.</p>
         * 
         * <strong>example:</strong>
         * <p>20020301</p>
         */
        @NameInMap("birthday")
        public String birthday;

        /**
         * <p>The credential information.</p>
         */
        @NameInMap("credential")
        public OrderListResponseBodyDataListPassengerListCredential credential;

        /**
         * <p>The first name.</p>
         * 
         * <strong>example:</strong>
         * <p>SAN</p>
         */
        @NameInMap("first_name")
        public String firstName;

        /**
         * <p>The gender. Valid values:</p>
         * <ul>
         * <li>0: MALE.</li>
         * <li>1: FEMALE.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("gender")
        public Integer gender;

        /**
         * <p>The last name.</p>
         * 
         * <strong>example:</strong>
         * <p>ZHANG</p>
         */
        @NameInMap("last_name")
        public String lastName;

        /**
         * <p>The country code of the mobile phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        @NameInMap("mobile_country_code")
        public String mobileCountryCode;

        /**
         * <p>The mobile phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>183******96</p>
         */
        @NameInMap("mobile_phone_number")
        public String mobilePhoneNumber;

        /**
         * <p>The two-letter nationality code.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("nationality")
        public String nationality;

        /**
         * <p>The passenger type. Valid values:</p>
         * <ul>
         * <li>0: adult.</li>
         * <li>1: child.</li>
         * <li>8: infant.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
        /**
         * <p>The booking time (order creation time). The value is a 13-digit UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1677210784000</p>
         */
        @NameInMap("book_time")
        public Long bookTime;

        /**
         * <p>The order number.</p>
         * 
         * <strong>example:</strong>
         * <p>4966***617111</p>
         */
        @NameInMap("order_num")
        public Long orderNum;

        /**
         * <p>The order status. Valid values:</p>
         * <ul>
         * <li>2: order creation succeeded.</li>
         * <li>3: order paid.</li>
         * <li>4: order succeeded.</li>
         * <li>5: order closed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("order_status")
        public String orderStatus;

        /**
         * <p>The external order number.</p>
         * 
         * <strong>example:</strong>
         * <p>x091-2023-0220-j-0001</p>
         */
        @NameInMap("out_order_num")
        public String outOrderNum;

        /**
         * <p>The passenger list.</p>
         */
        @NameInMap("passenger_list")
        public java.util.List<OrderListResponseBodyDataListPassengerList> passengerList;

        /**
         * <p>The payment status. Valid values:</p>
         * <ul>
         * <li>0: initialized.</li>
         * <li>1: creation succeeded.</li>
         * <li>2: payment succeeded.</li>
         * <li>4: transaction closed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("pay_status")
        public String payStatus;

        /**
         * <p>The payment time. The value is a 13-digit UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1677210788000</p>
         */
        @NameInMap("pay_time")
        public Long payTime;

        /**
         * <p>The discount amount. Unit: yuan.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("promotion_price")
        public Double promotionPrice;

        /**
         * <p>The actual payment amount. Unit: yuan.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("real_pay_price")
        public Double realPayPrice;

        /**
         * <p>The buyer nickname.</p>
         * 
         * <strong>example:</strong>
         * <p>nick</p>
         */
        @NameInMap("session_nick")
        public String sessionNick;

        /**
         * <p>The ticketing time. The value is a 13-digit UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1677210786000</p>
         */
        @NameInMap("succeed_time")
        public Long succeedTime;

        /**
         * <p>The total price of the order. Unit: yuan.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("total_price")
        public Double totalPrice;

        /**
         * <p>The transaction serial number.</p>
         * 
         * <strong>example:</strong>
         * <p>hkduendkd-2023-dj0</p>
         */
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
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("current_page")
        public Integer currentPage;

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("page_size")
        public Integer pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("total_count")
        public Integer totalCount;

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>The data list.</p>
         */
        @NameInMap("list")
        public java.util.List<OrderListResponseBodyDataList> list;

        /**
         * <p>The pagination information.</p>
         */
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
