// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ChangeApplyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public ChangeApplyResponseBodyData data;

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

    public static ChangeApplyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeApplyResponseBody self = new ChangeApplyResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeApplyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeApplyResponseBody setData(ChangeApplyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ChangeApplyResponseBodyData getData() {
        return this.data;
    }

    public ChangeApplyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ChangeApplyResponseBody setErrorData(Object errorData) {
        this.errorData = errorData;
        return this;
    }
    public Object getErrorData() {
        return this.errorData;
    }

    public ChangeApplyResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ChangeApplyResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ChangeApplyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ChangeApplyResponseBodyDataChangeOrdersPassengers extends TeaModel {
        @NameInMap("document")
        public String document;

        @NameInMap("first_name")
        public String firstName;

        @NameInMap("last_name")
        public String lastName;

        public static ChangeApplyResponseBodyDataChangeOrdersPassengers build(java.util.Map<String, ?> map) throws Exception {
            ChangeApplyResponseBodyDataChangeOrdersPassengers self = new ChangeApplyResponseBodyDataChangeOrdersPassengers();
            return TeaModel.build(map, self);
        }

        public ChangeApplyResponseBodyDataChangeOrdersPassengers setDocument(String document) {
            this.document = document;
            return this;
        }
        public String getDocument() {
            return this.document;
        }

        public ChangeApplyResponseBodyDataChangeOrdersPassengers setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public ChangeApplyResponseBodyDataChangeOrdersPassengers setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

    }

    public static class ChangeApplyResponseBodyDataChangeOrders extends TeaModel {
        @NameInMap("change_order_num")
        public Long changeOrderNum;

        @NameInMap("change_order_status")
        public Integer changeOrderStatus;

        @NameInMap("fail_reason")
        public String failReason;

        @NameInMap("passengers")
        public java.util.List<ChangeApplyResponseBodyDataChangeOrdersPassengers> passengers;

        public static ChangeApplyResponseBodyDataChangeOrders build(java.util.Map<String, ?> map) throws Exception {
            ChangeApplyResponseBodyDataChangeOrders self = new ChangeApplyResponseBodyDataChangeOrders();
            return TeaModel.build(map, self);
        }

        public ChangeApplyResponseBodyDataChangeOrders setChangeOrderNum(Long changeOrderNum) {
            this.changeOrderNum = changeOrderNum;
            return this;
        }
        public Long getChangeOrderNum() {
            return this.changeOrderNum;
        }

        public ChangeApplyResponseBodyDataChangeOrders setChangeOrderStatus(Integer changeOrderStatus) {
            this.changeOrderStatus = changeOrderStatus;
            return this;
        }
        public Integer getChangeOrderStatus() {
            return this.changeOrderStatus;
        }

        public ChangeApplyResponseBodyDataChangeOrders setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public ChangeApplyResponseBodyDataChangeOrders setPassengers(java.util.List<ChangeApplyResponseBodyDataChangeOrdersPassengers> passengers) {
            this.passengers = passengers;
            return this;
        }
        public java.util.List<ChangeApplyResponseBodyDataChangeOrdersPassengers> getPassengers() {
            return this.passengers;
        }

    }

    public static class ChangeApplyResponseBodyData extends TeaModel {
        @NameInMap("change_orders")
        public java.util.List<ChangeApplyResponseBodyDataChangeOrders> changeOrders;

        @NameInMap("order_num")
        public Long orderNum;

        public static ChangeApplyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ChangeApplyResponseBodyData self = new ChangeApplyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ChangeApplyResponseBodyData setChangeOrders(java.util.List<ChangeApplyResponseBodyDataChangeOrders> changeOrders) {
            this.changeOrders = changeOrders;
            return this;
        }
        public java.util.List<ChangeApplyResponseBodyDataChangeOrders> getChangeOrders() {
            return this.changeOrders;
        }

        public ChangeApplyResponseBodyData setOrderNum(Long orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Long getOrderNum() {
            return this.orderNum;
        }

    }

}
