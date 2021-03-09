// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetCustomerInfoResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 错误信息
    @NameInMap("Message")
    public String message;

    // 错误码
    @NameInMap("Code")
    public String code;

    // 是否请求成功
    @NameInMap("Success")
    public Boolean success;

    // 会员信息
    @NameInMap("Data")
    public GetCustomerInfoResponseBodyData data;

    public static GetCustomerInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerInfoResponseBody self = new GetCustomerInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomerInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomerInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCustomerInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCustomerInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetCustomerInfoResponseBody setData(GetCustomerInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCustomerInfoResponseBodyData getData() {
        return this.data;
    }

    public static class GetCustomerInfoResponseBodyData extends TeaModel {
        // 昵称
        @NameInMap("Nick")
        public String nick;

        // 头像
        @NameInMap("Photo")
        public String photo;

        // 会员ID
        @NameInMap("UserId")
        public Long userId;

        // 真实姓名
        @NameInMap("RealName")
        public String realName;

        // 外部ID
        @NameInMap("OuterId")
        public String outerId;

        // 自定义字段
        @NameInMap("CustomizeFields")
        public java.util.Map<String, ?> customizeFields;

        public static GetCustomerInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomerInfoResponseBodyData self = new GetCustomerInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCustomerInfoResponseBodyData setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public GetCustomerInfoResponseBodyData setPhoto(String photo) {
            this.photo = photo;
            return this;
        }
        public String getPhoto() {
            return this.photo;
        }

        public GetCustomerInfoResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public GetCustomerInfoResponseBodyData setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public GetCustomerInfoResponseBodyData setOuterId(String outerId) {
            this.outerId = outerId;
            return this;
        }
        public String getOuterId() {
            return this.outerId;
        }

        public GetCustomerInfoResponseBodyData setCustomizeFields(java.util.Map<String, ?> customizeFields) {
            this.customizeFields = customizeFields;
            return this;
        }
        public java.util.Map<String, ?> getCustomizeFields() {
            return this.customizeFields;
        }

    }

}
