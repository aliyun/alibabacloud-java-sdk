// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class GetQualificationUploadPolicyResponseBody extends TeaModel {
    @NameInMap("Policy")
    public String policy;

    @NameInMap("Expire")
    public String expire;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Accessid")
    public String accessid;

    @NameInMap("Signature")
    public String signature;

    @NameInMap("Host")
    public String host;

    @NameInMap("Prefix")
    public String prefix;

    @NameInMap("Dir")
    public String dir;

    public static GetQualificationUploadPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualificationUploadPolicyResponseBody self = new GetQualificationUploadPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualificationUploadPolicyResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public GetQualificationUploadPolicyResponseBody setExpire(String expire) {
        this.expire = expire;
        return this;
    }
    public String getExpire() {
        return this.expire;
    }

    public GetQualificationUploadPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualificationUploadPolicyResponseBody setAccessid(String accessid) {
        this.accessid = accessid;
        return this;
    }
    public String getAccessid() {
        return this.accessid;
    }

    public GetQualificationUploadPolicyResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public GetQualificationUploadPolicyResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public GetQualificationUploadPolicyResponseBody setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public GetQualificationUploadPolicyResponseBody setDir(String dir) {
        this.dir = dir;
        return this;
    }
    public String getDir() {
        return this.dir;
    }

}
