// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetOSSInfoForCardTemplateResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>For more information about other response codes, see <a href="https://help.aliyun.com/document_detail/101346.html">API error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetOSSInfoForCardTemplateResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A90E4451-FED7-49D2-87C8-00700A8C4D0D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetOSSInfoForCardTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOSSInfoForCardTemplateResponseBody self = new GetOSSInfoForCardTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOSSInfoForCardTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOSSInfoForCardTemplateResponseBody setData(GetOSSInfoForCardTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOSSInfoForCardTemplateResponseBodyData getData() {
        return this.data;
    }

    public GetOSSInfoForCardTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOSSInfoForCardTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOSSInfoForCardTemplateResponseBodyData extends TeaModel {
        /**
         * <p>The AccessKey ID.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAIxetqt1Dg****</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>599333677478****</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <p>The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>alicom-cardsms-resources</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The timeout period.</p>
         * 
         * <strong>example:</strong>
         * <p>1634209418</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The hostname.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://alicom-cardsms-resources.oss-cn-zhangjiakou.aliyuncs.com">https://alicom-cardsms-resources.oss-cn-zhangjiakou.aliyuncs.com</a></p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The signature policy.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJxxx0=</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The signature.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        @NameInMap("Signature")
        public String signature;

        /**
         * <p>The path of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1631792777</p>
         */
        @NameInMap("StartPath")
        public String startPath;

        public static GetOSSInfoForCardTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOSSInfoForCardTemplateResponseBodyData self = new GetOSSInfoForCardTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOSSInfoForCardTemplateResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetOSSInfoForCardTemplateResponseBodyData setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public GetOSSInfoForCardTemplateResponseBodyData setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetOSSInfoForCardTemplateResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetOSSInfoForCardTemplateResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetOSSInfoForCardTemplateResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetOSSInfoForCardTemplateResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GetOSSInfoForCardTemplateResponseBodyData setStartPath(String startPath) {
            this.startPath = startPath;
            return this;
        }
        public String getStartPath() {
            return this.startPath;
        }

    }

}
