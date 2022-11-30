// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class GetOssInfoForUploadFileResponseBody extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("Host")
    public String host;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Signature")
    public String signature;

    @NameInMap("StartWith")
    public String startWith;

    public static GetOssInfoForUploadFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssInfoForUploadFileResponseBody self = new GetOssInfoForUploadFileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssInfoForUploadFileResponseBody setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public GetOssInfoForUploadFileResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public GetOssInfoForUploadFileResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public GetOssInfoForUploadFileResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public GetOssInfoForUploadFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOssInfoForUploadFileResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public GetOssInfoForUploadFileResponseBody setStartWith(String startWith) {
        this.startWith = startWith;
        return this;
    }
    public String getStartWith() {
        return this.startWith;
    }

}
