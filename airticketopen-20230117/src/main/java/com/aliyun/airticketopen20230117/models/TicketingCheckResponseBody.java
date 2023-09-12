// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketingCheckResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public TicketingCheckResponseBodyData data;

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

    public static TicketingCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TicketingCheckResponseBody self = new TicketingCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public TicketingCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TicketingCheckResponseBody setData(TicketingCheckResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TicketingCheckResponseBodyData getData() {
        return this.data;
    }

    public TicketingCheckResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TicketingCheckResponseBody setErrorData(Object errorData) {
        this.errorData = errorData;
        return this;
    }
    public Object getErrorData() {
        return this.errorData;
    }

    public TicketingCheckResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public TicketingCheckResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public TicketingCheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TicketingCheckResponseBodyData extends TeaModel {
        @NameInMap("order_num")
        public Long orderNum;

        public static TicketingCheckResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TicketingCheckResponseBodyData self = new TicketingCheckResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TicketingCheckResponseBodyData setOrderNum(Long orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Long getOrderNum() {
            return this.orderNum;
        }

    }

}
