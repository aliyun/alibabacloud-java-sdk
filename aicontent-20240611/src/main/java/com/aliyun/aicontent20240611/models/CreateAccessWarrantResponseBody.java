// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class CreateAccessWarrantResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public CreateAccessWarrantResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>未知错误</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateAccessWarrantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessWarrantResponseBody self = new CreateAccessWarrantResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAccessWarrantResponseBody setData(CreateAccessWarrantResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAccessWarrantResponseBodyData getData() {
        return this.data;
    }

    public CreateAccessWarrantResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CreateAccessWarrantResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CreateAccessWarrantResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateAccessWarrantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAccessWarrantResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateAccessWarrantResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("AccessToken")
        public String accessToken;

        /**
         * <strong>example:</strong>
         * <p>ex2xxxxxxxx</p>
         */
        @NameInMap("AccessWarrantId")
        public String accessWarrantId;

        /**
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("ApplicationAccessId")
        public String applicationAccessId;

        /**
         * <strong>example:</strong>
         * <p>1672531200</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1672531200</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static CreateAccessWarrantResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAccessWarrantResponseBodyData self = new CreateAccessWarrantResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAccessWarrantResponseBodyData setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

        public CreateAccessWarrantResponseBodyData setAccessWarrantId(String accessWarrantId) {
            this.accessWarrantId = accessWarrantId;
            return this;
        }
        public String getAccessWarrantId() {
            return this.accessWarrantId;
        }

        public CreateAccessWarrantResponseBodyData setApplicationAccessId(String applicationAccessId) {
            this.applicationAccessId = applicationAccessId;
            return this;
        }
        public String getApplicationAccessId() {
            return this.applicationAccessId;
        }

        public CreateAccessWarrantResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateAccessWarrantResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public CreateAccessWarrantResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
