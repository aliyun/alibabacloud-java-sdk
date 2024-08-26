// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class GetQualificationUploadPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>hObpgEXoca42****</p>
     */
    @NameInMap("Accessid")
    public String accessid;

    /**
     * <strong>example:</strong>
     * <p>20211220/131953297274****_4de3db85-4f98-488d-845b-d75bf035b13d</p>
     */
    @NameInMap("Dir")
    public String dir;

    /**
     * <strong>example:</strong>
     * <p>1593688811881</p>
     */
    @NameInMap("Expire")
    public String expire;

    /**
     * <strong>example:</strong>
     * <p>https://<strong><strong><strong><strong>-review.oss-cn-</strong></strong></strong></strong>.aliyuncs.com</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <strong>example:</strong>
     * <p>eyJleHBpcmF0aW9uIjoiMjAaMC0wNy0wMlQxKToyMDoxMS44ODRaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsNTI0Mjg4MDBdLFsic3RhcnRzLXdpdGgiLCIka2V5IiwiMTIxOTU0MTE2MTIxMzA1Ny9PRkZMSU5FX1RSQU5TRkVSLzE1OTM2ODg1MTE4ODMi****</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <strong>example:</strong>
     * <p>20211220/131953297274****<em>4de3db85-4f98-488d-845b-d75bf035b13d</em>${filename}</p>
     */
    @NameInMap("Prefix")
    public String prefix;

    /**
     * <strong>example:</strong>
     * <p>9DFCF6F8-243C-****-8035-4B12FEFD7D48</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>pNVECGkyL0tl4bKXekV5ErZ****</p>
     */
    @NameInMap("Signature")
    public String signature;

    public static GetQualificationUploadPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualificationUploadPolicyResponseBody self = new GetQualificationUploadPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualificationUploadPolicyResponseBody setAccessid(String accessid) {
        this.accessid = accessid;
        return this;
    }
    public String getAccessid() {
        return this.accessid;
    }

    public GetQualificationUploadPolicyResponseBody setDir(String dir) {
        this.dir = dir;
        return this;
    }
    public String getDir() {
        return this.dir;
    }

    public GetQualificationUploadPolicyResponseBody setExpire(String expire) {
        this.expire = expire;
        return this;
    }
    public String getExpire() {
        return this.expire;
    }

    public GetQualificationUploadPolicyResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public GetQualificationUploadPolicyResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public GetQualificationUploadPolicyResponseBody setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public GetQualificationUploadPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualificationUploadPolicyResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
