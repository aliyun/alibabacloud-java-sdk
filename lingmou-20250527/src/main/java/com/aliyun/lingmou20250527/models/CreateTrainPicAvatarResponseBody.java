// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CreateTrainPicAvatarResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateTrainPicAvatarResponseBodyData data;

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

    public static CreateTrainPicAvatarResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTrainPicAvatarResponseBody self = new CreateTrainPicAvatarResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTrainPicAvatarResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTrainPicAvatarResponseBody setData(CreateTrainPicAvatarResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTrainPicAvatarResponseBodyData getData() {
        return this.data;
    }

    public CreateTrainPicAvatarResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateTrainPicAvatarResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTrainPicAvatarResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTrainPicAvatarResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateTrainPicAvatarResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>M1AguofmMxaoUQsuSPQ3j0ng</p>
         */
        @NameInMap("avatarId")
        public String avatarId;

        /**
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("expectedCompletionTime")
        public Integer expectedCompletionTime;

        @NameInMap("pass")
        public Boolean pass;

        public static CreateTrainPicAvatarResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTrainPicAvatarResponseBodyData self = new CreateTrainPicAvatarResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTrainPicAvatarResponseBodyData setAvatarId(String avatarId) {
            this.avatarId = avatarId;
            return this;
        }
        public String getAvatarId() {
            return this.avatarId;
        }

        public CreateTrainPicAvatarResponseBodyData setExpectedCompletionTime(Integer expectedCompletionTime) {
            this.expectedCompletionTime = expectedCompletionTime;
            return this;
        }
        public Integer getExpectedCompletionTime() {
            return this.expectedCompletionTime;
        }

        public CreateTrainPicAvatarResponseBodyData setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

    }

}
