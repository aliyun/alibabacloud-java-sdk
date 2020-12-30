// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeUploadPreSignResponseBody extends TeaModel {
    @NameInMap("Policy")
    public String policy;

    @NameInMap("Expire")
    public String expire;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("Signature")
    public String signature;

    @NameInMap("Host")
    public String host;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Key")
    public String key;

    @NameInMap("Success")
    public Boolean success;

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

    public DescribeUploadPreSignResponseBody setExpire(String expire) {
        this.expire = expire;
        return this;
    }
    public String getExpire() {
        return this.expire;
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

    public DescribeUploadPreSignResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DescribeUploadPreSignResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeUploadPreSignResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeUploadPreSignResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
