// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetCustomerInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCustomerInfoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>DF6A3FB7-A5AA-43BE-A65B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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

        /**
         * <strong>example:</strong>
         * <p>6666666</p>
         */
        @NameInMap("OuterId")
        public String outerId;

        /**
         * <strong>example:</strong>
         * <p><a href="https://thirdwx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTLSW7XPFlJDwVunXP8pr84TvltwtLlNqTlOVSFeM3bCgn57mAB4JuZZmvMW0qicqW0PyzyUdZpxiaFQ">https://thirdwx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTLSW7XPFlJDwVunXP8pr84TvltwtLlNqTlOVSFeM3bCgn57mAB4JuZZmvMW0qicqW0PyzyUdZpxiaFQ</a></p>
         */
        @NameInMap("Photo")
        public String photo;

        @NameInMap("RealName")
        public String realName;

        /**
         * <strong>example:</strong>
         * <p>823456789023</p>
         */
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
