// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class GetQualificationUploadPolicyResponseBody extends TeaModel {
    @NameInMap("Accessid")
    public String accessid;

    @NameInMap("Dir")
    public String dir;

    @NameInMap("Expire")
    public String expire;

    @NameInMap("Host")
    public String host;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("Prefix")
    public String prefix;

    @NameInMap("RequestId")
    public String requestId;

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
