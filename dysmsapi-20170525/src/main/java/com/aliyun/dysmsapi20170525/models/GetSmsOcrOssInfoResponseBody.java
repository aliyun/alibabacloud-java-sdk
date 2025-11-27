// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetSmsOcrOssInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public GetSmsOcrOssInfoResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>25D5AFDE-xxxx-132E-8909-1FDC071DA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSmsOcrOssInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSmsOcrOssInfoResponseBody self = new GetSmsOcrOssInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSmsOcrOssInfoResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetSmsOcrOssInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSmsOcrOssInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSmsOcrOssInfoResponseBody setModel(GetSmsOcrOssInfoResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public GetSmsOcrOssInfoResponseBodyModel getModel() {
        return this.model;
    }

    public GetSmsOcrOssInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSmsOcrOssInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSmsOcrOssInfoResponseBodyModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>bypFNbG******</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <strong>example:</strong>
         * <p>1741521339</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>http://***.oss-cn-zhangjiakou.aliyuncs.com</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMjAyNS0wMy0wOVQxMTo1NTozOS4wMDFaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjAwMF0seyJidWNrZXQiOiJhbGljb20tZmMtbWVkaWEifSxbImVxIiwiJGtleSIsIjEwMDAwMDM1ODA4MjA2M1wv********</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <strong>example:</strong>
         * <p>QvNTGC9DSLTeByP+ZWW******</p>
         */
        @NameInMap("Signature")
        public String signature;

        /**
         * <strong>example:</strong>
         * <p>1000********001</p>
         */
        @NameInMap("StartPath")
        public String startPath;

        public static GetSmsOcrOssInfoResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            GetSmsOcrOssInfoResponseBodyModel self = new GetSmsOcrOssInfoResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public GetSmsOcrOssInfoResponseBodyModel setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetSmsOcrOssInfoResponseBodyModel setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetSmsOcrOssInfoResponseBodyModel setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetSmsOcrOssInfoResponseBodyModel setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetSmsOcrOssInfoResponseBodyModel setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetSmsOcrOssInfoResponseBodyModel setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GetSmsOcrOssInfoResponseBodyModel setStartPath(String startPath) {
            this.startPath = startPath;
            return this;
        }
        public String getStartPath() {
            return this.startPath;
        }

    }

}
