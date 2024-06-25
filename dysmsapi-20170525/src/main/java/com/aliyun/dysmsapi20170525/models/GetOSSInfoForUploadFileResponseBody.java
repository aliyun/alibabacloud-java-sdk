// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetOSSInfoForUploadFileResponseBody extends TeaModel {
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
    public GetOSSInfoForUploadFileResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>A90E4451-FED7-49D2-87C8-00700EDCFD0D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetOSSInfoForUploadFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOSSInfoForUploadFileResponseBody self = new GetOSSInfoForUploadFileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOSSInfoForUploadFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOSSInfoForUploadFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOSSInfoForUploadFileResponseBody setModel(GetOSSInfoForUploadFileResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public GetOSSInfoForUploadFileResponseBodyModel getModel() {
        return this.model;
    }

    public GetOSSInfoForUploadFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOSSInfoForUploadFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOSSInfoForUploadFileResponseBodyModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>LTAIxetqt1Dg****</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <strong>example:</strong>
         * <p>1719297445</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p><a href="https://alicom-fc-media.oss-cn-zhangjiakou.aliyuncs.com">https://alicom-fc-media.oss-cn-zhangjiakou.aliyuncs.com</a></p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMjAyN<em><strong>Ni0yNVQwNjozNzoyNS45NzBaI</strong>iY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjAwMF0sWyJzdGFydHMtd2l0</em>**sIiRrZXkiLCIiXV19</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <strong>example:</strong>
         * <p>BXnwCWPrhVb*****aoZHZfli5KE=</p>
         */
        @NameInMap("Signature")
        public String signature;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("StartPath")
        public String startPath;

        public static GetOSSInfoForUploadFileResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            GetOSSInfoForUploadFileResponseBodyModel self = new GetOSSInfoForUploadFileResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public GetOSSInfoForUploadFileResponseBodyModel setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetOSSInfoForUploadFileResponseBodyModel setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetOSSInfoForUploadFileResponseBodyModel setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetOSSInfoForUploadFileResponseBodyModel setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetOSSInfoForUploadFileResponseBodyModel setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GetOSSInfoForUploadFileResponseBodyModel setStartPath(String startPath) {
            this.startPath = startPath;
            return this;
        }
        public String getStartPath() {
            return this.startPath;
        }

    }

}
