// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetSmsOcrOssInfoResponseBody extends TeaModel {
    /**
     * <p>访问被拒绝详细信息，只有 RAM 校验失败才会返回此字段。</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>请求状态码。</p>
     * <ul>
     * <li><p>返回 OK 代表请求成功。</p>
     * </li>
     * <li><p>其他错误码，请参见 <a href="https://www.alibabacloud.com/help/en/sms/developer-reference/api-error-codes">API 错误码</a>。</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>状态码的描述。</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>OSS配置信息。</p>
     */
    @NameInMap("Model")
    public GetSmsOcrOssInfoResponseBodyModel model;

    /**
     * <p>本次调用请求的 ID，是由阿里云为该请求生成的唯一标识符，可用于排查和定位问题。</p>
     * 
     * <strong>example:</strong>
     * <p>25D5AFDE-xxxx-132E-8909-1FDC071DA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>调用接口是否成功。取值：</p>
     * <ul>
     * <li><p>true：调用成功。</p>
     * </li>
     * <li><p>false：调用失败。</p>
     * </li>
     * </ul>
     * 
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
         * <p>签名使用的 AccessKey ID。</p>
         * 
         * <strong>example:</strong>
         * <p>bypFNbG******</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>bucket名称。</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>过期时间戳，单位：秒。</p>
         * 
         * <strong>example:</strong>
         * <p>1741521339</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>Host 地址。</p>
         * 
         * <strong>example:</strong>
         * <p>http://***.oss-cn-zhangjiakou.aliyuncs.com</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>签名策略。</p>
         * 
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMjAyNS0wMy0wOVQxMTo1NTozOS4wMDFaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjAwMF0seyJidWNrZXQiOiJhbGljb20tZmMtbWVkaWEifSxbImVxIiwiJGtleSIsIjEwMDAwMDM1ODA4MjA2M1wv********</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>根据 AccessKey Secret 和 Policy 计算出的签名信息。调用 OSS API 时，OSS 验证该签名信息，从而确认请求的合法性。</p>
         * 
         * <strong>example:</strong>
         * <p>QvNTGC9DSLTeByP+ZWW******</p>
         */
        @NameInMap("Signature")
        public String signature;

        /**
         * <p>策略路径。</p>
         * 
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
