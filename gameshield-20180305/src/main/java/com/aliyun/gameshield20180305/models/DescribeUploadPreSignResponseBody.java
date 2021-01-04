// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeUploadPreSignResponseBody extends TeaModel {
    @NameInMap("Policy")
    public String policy;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("Signature")
    public String signature;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    @NameInMap("Host")
    public String host;

    @NameInMap("Key")
    public String key;

    public static DescribeUploadPreSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUploadPreSignResponseBody self = new DescribeUploadPreSignResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUploadPreSignResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public DescribeUploadPreSignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUploadPreSignResponseBody setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public DescribeUploadPreSignResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public DescribeUploadPreSignResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public DescribeUploadPreSignResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DescribeUploadPreSignResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
