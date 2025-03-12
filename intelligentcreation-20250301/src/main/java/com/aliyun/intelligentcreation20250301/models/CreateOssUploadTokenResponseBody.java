// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20250301.models;

import com.aliyun.tea.*;

public class CreateOssUploadTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>LTAI5tQPEXqDVu7794Bvw2xM</p>
     */
    @NameInMap("AccessId")
    public String accessId;

    /**
     * <strong>example:</strong>
     * <p>1740758400000</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <strong>example:</strong>
     * <p><a href="https://bucket-name.oss-zhangjiakou.aliyuncs.com">https://bucket-name.oss-zhangjiakou.aliyuncs.com</a></p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <strong>example:</strong>
     * <p>path/filename.jsonl</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <strong>example:</strong>
     * <p>vyAnsgE0fgjYGF0W79ryhhhQmec=</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <strong>example:</strong>
     * <p>ABCDEFGH-1234-5678-90AB-123456789ABC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>vyAnsgE0fgjYGF0W79ryhhhQmec=</p>
     */
    @NameInMap("Signature")
    public String signature;

    /**
     * <strong>example:</strong>
     * <p><a href="https://bucket-name.oss-zhangjiakou.aliyuncs.com/path/filename.jsonl">https://bucket-name.oss-zhangjiakou.aliyuncs.com/path/filename.jsonl</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static CreateOssUploadTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOssUploadTokenResponseBody self = new CreateOssUploadTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOssUploadTokenResponseBody setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public CreateOssUploadTokenResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public CreateOssUploadTokenResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public CreateOssUploadTokenResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public CreateOssUploadTokenResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public CreateOssUploadTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOssUploadTokenResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public CreateOssUploadTokenResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
