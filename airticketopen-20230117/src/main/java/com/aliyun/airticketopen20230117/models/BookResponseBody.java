// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class BookResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public BookResponseBodyData data;

    @NameInMap("error_code")
    public String errorCode;

    @NameInMap("error_data")
    public BookResponseBodyErrorData errorData;

    @NameInMap("error_msg")
    public String errorMsg;

    @NameInMap("status")
    public Integer status;

    @NameInMap("success")
    public Boolean success;

    public static BookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BookResponseBody self = new BookResponseBody();
        return TeaModel.build(map, self);
    }

    public BookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BookResponseBody setData(BookResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BookResponseBodyData getData() {
        return this.data;
    }

    public BookResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public BookResponseBody setErrorData(BookResponseBodyErrorData errorData) {
        this.errorData = errorData;
        return this;
    }
    public BookResponseBodyErrorData getErrorData() {
        return this.errorData;
    }

    public BookResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public BookResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public BookResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BookResponseBodyDataOrderList extends TeaModel {
        @NameInMap("order_num")
        public Long orderNum;

        public static BookResponseBodyDataOrderList build(java.util.Map<String, ?> map) throws Exception {
            BookResponseBodyDataOrderList self = new BookResponseBodyDataOrderList();
            return TeaModel.build(map, self);
        }

        public BookResponseBodyDataOrderList setOrderNum(Long orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Long getOrderNum() {
            return this.orderNum;
        }

    }

    public static class BookResponseBodyData extends TeaModel {
        @NameInMap("order_list")
        public java.util.List<BookResponseBodyDataOrderList> orderList;

        public static BookResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BookResponseBodyData self = new BookResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BookResponseBodyData setOrderList(java.util.List<BookResponseBodyDataOrderList> orderList) {
            this.orderList = orderList;
            return this;
        }
        public java.util.List<BookResponseBodyDataOrderList> getOrderList() {
            return this.orderList;
        }

    }

    public static class BookResponseBodyErrorDataOrderList extends TeaModel {
        @NameInMap("order_num")
        public Long orderNum;

        public static BookResponseBodyErrorDataOrderList build(java.util.Map<String, ?> map) throws Exception {
            BookResponseBodyErrorDataOrderList self = new BookResponseBodyErrorDataOrderList();
            return TeaModel.build(map, self);
        }

        public BookResponseBodyErrorDataOrderList setOrderNum(Long orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Long getOrderNum() {
            return this.orderNum;
        }

    }

    public static class BookResponseBodyErrorData extends TeaModel {
        @NameInMap("order_list")
        public java.util.List<BookResponseBodyErrorDataOrderList> orderList;

        public static BookResponseBodyErrorData build(java.util.Map<String, ?> map) throws Exception {
            BookResponseBodyErrorData self = new BookResponseBodyErrorData();
            return TeaModel.build(map, self);
        }

        public BookResponseBodyErrorData setOrderList(java.util.List<BookResponseBodyErrorDataOrderList> orderList) {
            this.orderList = orderList;
            return this;
        }
        public java.util.List<BookResponseBodyErrorDataOrderList> getOrderList() {
            return this.orderList;
        }

    }

}
