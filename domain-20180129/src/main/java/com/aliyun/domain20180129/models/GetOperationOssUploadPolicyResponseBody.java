// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class GetOperationOssUploadPolicyResponseBody extends TeaModel {
    @NameInMap("Accessid")
    public String accessid;

    @NameInMap("EncodedPolicy")
    public String encodedPolicy;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("FileDir")
    public String fileDir;

    /**
     * <p>OSS Endpoint。</p>
     */
    @NameInMap("Host")
    public String host;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Signature")
    public String signature;

    public static GetOperationOssUploadPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOperationOssUploadPolicyResponseBody self = new GetOperationOssUploadPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOperationOssUploadPolicyResponseBody setAccessid(String accessid) {
        this.accessid = accessid;
        return this;
    }
    public String getAccessid() {
        return this.accessid;
    }

    public GetOperationOssUploadPolicyResponseBody setEncodedPolicy(String encodedPolicy) {
        this.encodedPolicy = encodedPolicy;
        return this;
    }
    public String getEncodedPolicy() {
        return this.encodedPolicy;
    }

    public GetOperationOssUploadPolicyResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public GetOperationOssUploadPolicyResponseBody setFileDir(String fileDir) {
        this.fileDir = fileDir;
        return this;
    }
    public String getFileDir() {
        return this.fileDir;
    }

    public GetOperationOssUploadPolicyResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public GetOperationOssUploadPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOperationOssUploadPolicyResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
