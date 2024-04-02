// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeImageUploadInfoResponseBody extends TeaModel {
    @NameInMap("Accessid")
    public String accessid;

    @NameInMap("Expire")
    public Integer expire;

    @NameInMap("Folder")
    public String folder;

    @NameInMap("Host")
    public String host;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Signature")
    public String signature;

    public static DescribeImageUploadInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageUploadInfoResponseBody self = new DescribeImageUploadInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageUploadInfoResponseBody setAccessid(String accessid) {
        this.accessid = accessid;
        return this;
    }
    public String getAccessid() {
        return this.accessid;
    }

    public DescribeImageUploadInfoResponseBody setExpire(Integer expire) {
        this.expire = expire;
        return this;
    }
    public Integer getExpire() {
        return this.expire;
    }

    public DescribeImageUploadInfoResponseBody setFolder(String folder) {
        this.folder = folder;
        return this;
    }
    public String getFolder() {
        return this.folder;
    }

    public DescribeImageUploadInfoResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DescribeImageUploadInfoResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public DescribeImageUploadInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageUploadInfoResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
