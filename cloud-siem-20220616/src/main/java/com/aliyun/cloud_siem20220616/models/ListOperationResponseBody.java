// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListOperationResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListOperationResponseBodyData data;

    @NameInMap("DyCode")
    public String dyCode;

    @NameInMap("DyMessage")
    public String dyMessage;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListOperationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOperationResponseBody self = new ListOperationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOperationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListOperationResponseBody setData(ListOperationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListOperationResponseBodyData getData() {
        return this.data;
    }

    public ListOperationResponseBody setDyCode(String dyCode) {
        this.dyCode = dyCode;
        return this;
    }
    public String getDyCode() {
        return this.dyCode;
    }

    public ListOperationResponseBody setDyMessage(String dyMessage) {
        this.dyMessage = dyMessage;
        return this;
    }
    public String getDyMessage() {
        return this.dyMessage;
    }

    public ListOperationResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListOperationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListOperationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOperationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListOperationResponseBodyData extends TeaModel {
        @NameInMap("AdminOrNot")
        public Boolean adminOrNot;

        @NameInMap("OperationList")
        public java.util.List<String> operationList;

        public static ListOperationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOperationResponseBodyData self = new ListOperationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOperationResponseBodyData setAdminOrNot(Boolean adminOrNot) {
            this.adminOrNot = adminOrNot;
            return this;
        }
        public Boolean getAdminOrNot() {
            return this.adminOrNot;
        }

        public ListOperationResponseBodyData setOperationList(java.util.List<String> operationList) {
            this.operationList = operationList;
            return this;
        }
        public java.util.List<String> getOperationList() {
            return this.operationList;
        }

    }

}
