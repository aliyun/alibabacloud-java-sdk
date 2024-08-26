// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class GetOperationOssUploadPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>hObpgEXoca42****</p>
     */
    @NameInMap("Accessid")
    public String accessid;

    /**
     * <strong>example:</strong>
     * <p>eyJleHBpcmF0aW9uIjoiMjAaMC0wNy0wMlQxKToyMDoxMS44ODRaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsNTI0Mjg4MDBdLFsic3RhcnRzLXdpdGgiLCIka2V5IiwiMTIxOTU0MTE2MTIxMzA1Ny9PRkZMSU5FX1RSQU5TRkVSLzE1OTM2ODg1MTE4ODMi****</p>
     */
    @NameInMap("EncodedPolicy")
    public String encodedPolicy;

    /**
     * <strong>example:</strong>
     * <p>1593688811881</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <strong>example:</strong>
     * <p>1219541161213157/OFFLINE_TRANSFER/159368851****</p>
     */
    @NameInMap("FileDir")
    public String fileDir;

    /**
     * <p>OSS Endpoint。</p>
     * 
     * <strong>example:</strong>
     * <p>//<em><strong>-basic-cert.oss-cn-</strong></em>.aliyuncs.com/</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <strong>example:</strong>
     * <p>9DFCF6F8-243C-40EC-8035-4B12FEFD7D011</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>pNVECGkyL0tl4bKXekV5ErZ****</p>
     */
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
