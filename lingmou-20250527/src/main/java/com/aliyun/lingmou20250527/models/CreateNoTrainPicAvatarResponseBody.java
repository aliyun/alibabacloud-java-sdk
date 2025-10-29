// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CreateNoTrainPicAvatarResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateNoTrainPicAvatarResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7239F9E5-A4DB-55BA-B701-0CE47DBDB0A8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateNoTrainPicAvatarResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNoTrainPicAvatarResponseBody self = new CreateNoTrainPicAvatarResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNoTrainPicAvatarResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateNoTrainPicAvatarResponseBody setData(CreateNoTrainPicAvatarResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateNoTrainPicAvatarResponseBodyData getData() {
        return this.data;
    }

    public CreateNoTrainPicAvatarResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateNoTrainPicAvatarResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateNoTrainPicAvatarResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNoTrainPicAvatarResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateNoTrainPicAvatarResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>M1ONzwuILu-nPT7pvr6maKvQ</p>
         */
        @NameInMap("avatarId")
        public String avatarId;

        /**
         * <strong>example:</strong>
         * <p>true/false</p>
         */
        @NameInMap("pass")
        public Boolean pass;

        public static CreateNoTrainPicAvatarResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateNoTrainPicAvatarResponseBodyData self = new CreateNoTrainPicAvatarResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateNoTrainPicAvatarResponseBodyData setAvatarId(String avatarId) {
            this.avatarId = avatarId;
            return this;
        }
        public String getAvatarId() {
            return this.avatarId;
        }

        public CreateNoTrainPicAvatarResponseBodyData setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

    }

}
