// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetOSSInfoForCardTemplateResponseBody extends TeaModel {
    /**
     * <p>请求状态码。</p>
     * <ul>
     * <li>OK：代表请求成功。</li>
     * <li>其他错误码，请参见<a href="https://help.aliyun.com/document_detail/101346.html">API错误码</a>。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>返回数据。</p>
     */
    @NameInMap("Data")
    public GetOSSInfoForCardTemplateResponseBodyData data;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>A90E4451-FED7-49D2-87C8-00700A8C4D0D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>调用接口是否成功。取值：</p>
     * <ul>
     * <li><p><strong>true</strong>：调用成功。</p>
     * </li>
     * <li><p><strong>false</strong>：调用失败。</p>
     * </li>
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
         * <p>签名使用的AccessKey ID。</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI************</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>阿里云账号ID。</p>
         * 
         * <strong>example:</strong>
         * <p>168**********184</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <p>OSS文件保存桶名称。</p>
         * 
         * <strong>example:</strong>
         * <p>alicom-cardsms-resources</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>超时时间戳。单位：秒。</p>
         * 
         * <strong>example:</strong>
         * <p>1634209418</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>访问地址。</p>
         * 
         * <strong>example:</strong>
         * <p>http://***.aliyuncs.com</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>签名策略。</p>
         * 
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMjAyNS0wMy0yNlQwMzo0NDoyMy4xNTlaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjAwMF0sWyJzdGFydHMtd2l0aCIsIiRrZXkiLCIxNDIwNjM0******************</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>短信签名。</p>
         * 
         * <strong>example:</strong>
         * <p>阿里云</p>
         */
        @NameInMap("Signature")
        public String signature;

        /**
         * <p>策略路径。</p>
         * 
         * <strong>example:</strong>
         * <p>168**********184</p>
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
