// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ettrafficisp20230830.models;

import com.aliyun.tea.*;

public class AkGenerateResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public AkGenerateResponseBodyData data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    public static AkGenerateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AkGenerateResponseBody self = new AkGenerateResponseBody();
        return TeaModel.build(map, self);
    }

    public AkGenerateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AkGenerateResponseBody setData(AkGenerateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AkGenerateResponseBodyData getData() {
        return this.data;
    }

    public AkGenerateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AkGenerateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AkGenerateResponseBodyData extends TeaModel {
        /**
         * <p>Access Key ID</p>
         */
        @NameInMap("accessKeyId")
        public String accessKeyId;

        @NameInMap("accessKeyName")
        public String accessKeyName;

        @NameInMap("accessKeySecret")
        public String accessKeySecret;

        @NameInMap("userId")
        public String userId;

        public static AkGenerateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AkGenerateResponseBodyData self = new AkGenerateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AkGenerateResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public AkGenerateResponseBodyData setAccessKeyName(String accessKeyName) {
            this.accessKeyName = accessKeyName;
            return this;
        }
        public String getAccessKeyName() {
            return this.accessKeyName;
        }

        public AkGenerateResponseBodyData setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public AkGenerateResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
