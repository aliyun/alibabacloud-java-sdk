// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetCustomerInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCustomerInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCustomerInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerInfoResponseBody self = new GetCustomerInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomerInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCustomerInfoResponseBody setData(GetCustomerInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCustomerInfoResponseBodyData getData() {
        return this.data;
    }

    public GetCustomerInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCustomerInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomerInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCustomerInfoResponseBodyData extends TeaModel {
        @NameInMap("CustomizeFields")
        public java.util.Map<String, ?> customizeFields;

        @NameInMap("Nick")
        public String nick;

        @NameInMap("OuterId")
        public String outerId;

        @NameInMap("Photo")
        public String photo;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("UserId")
        public Long userId;

        public static GetCustomerInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomerInfoResponseBodyData self = new GetCustomerInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCustomerInfoResponseBodyData setCustomizeFields(java.util.Map<String, ?> customizeFields) {
            this.customizeFields = customizeFields;
            return this;
        }
        public java.util.Map<String, ?> getCustomizeFields() {
            return this.customizeFields;
        }

        public GetCustomerInfoResponseBodyData setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public GetCustomerInfoResponseBodyData setOuterId(String outerId) {
            this.outerId = outerId;
            return this;
        }
        public String getOuterId() {
            return this.outerId;
        }

        public GetCustomerInfoResponseBodyData setPhoto(String photo) {
            this.photo = photo;
            return this;
        }
        public String getPhoto() {
            return this.photo;
        }

        public GetCustomerInfoResponseBodyData setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public GetCustomerInfoResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
