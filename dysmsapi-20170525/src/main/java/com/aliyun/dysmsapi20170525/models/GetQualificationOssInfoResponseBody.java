// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetQualificationOssInfoResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetQualificationOssInfoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>25D5AFDE-8EBC-132E-8909-1FDC071DA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetQualificationOssInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualificationOssInfoResponseBody self = new GetQualificationOssInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualificationOssInfoResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetQualificationOssInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQualificationOssInfoResponseBody setData(GetQualificationOssInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQualificationOssInfoResponseBodyData getData() {
        return this.data;
    }

    public GetQualificationOssInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQualificationOssInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualificationOssInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQualificationOssInfoResponseBodyData extends TeaModel {
        /**
         * <p>ak</p>
         * 
         * <strong>example:</strong>
         * <p>bypFNbG******</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>过期时间</p>
         * 
         * <strong>example:</strong>
         * <p>1741521339</p>
         */
        @NameInMap("Expire")
        public Long expire;

        /**
         * <p>域名</p>
         * 
         * <strong>example:</strong>
         * <p>http://***.oss-cn-zhangjiakou.aliyuncs.com</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>策略</p>
         * 
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMjAyNS0wMy0wOVQxMTo1NTozOS4wMDFaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjAwMF0seyJidWNrZXQiOiJhbGljb20tZmMtbWVkaWEifSxbImVxIiwiJGtleSIsIjEwMDAwMDM1ODA4MjA2M1wv********</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>签名</p>
         * 
         * <strong>example:</strong>
         * <p>QvNTGC9DSLTeByP+ZWW******</p>
         */
        @NameInMap("Signature")
        public String signature;

        /**
         * <p>前缀</p>
         * 
         * <strong>example:</strong>
         * <p>1000********001</p>
         */
        @NameInMap("StartPath")
        public String startPath;

        public static GetQualificationOssInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQualificationOssInfoResponseBodyData self = new GetQualificationOssInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQualificationOssInfoResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetQualificationOssInfoResponseBodyData setExpire(Long expire) {
            this.expire = expire;
            return this;
        }
        public Long getExpire() {
            return this.expire;
        }

        public GetQualificationOssInfoResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetQualificationOssInfoResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetQualificationOssInfoResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GetQualificationOssInfoResponseBodyData setStartPath(String startPath) {
            this.startPath = startPath;
            return this;
        }
        public String getStartPath() {
            return this.startPath;
        }

    }

}
