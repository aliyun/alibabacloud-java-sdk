// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeUploadInfoResponseBody extends TeaModel {
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

    public static DescribeUploadInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUploadInfoResponseBody self = new DescribeUploadInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUploadInfoResponseBody setAccessid(String accessid) {
        this.accessid = accessid;
        return this;
    }
    public String getAccessid() {
        return this.accessid;
    }

    public DescribeUploadInfoResponseBody setExpire(Integer expire) {
        this.expire = expire;
        return this;
    }
    public Integer getExpire() {
        return this.expire;
    }

    public DescribeUploadInfoResponseBody setFolder(String folder) {
        this.folder = folder;
        return this;
    }
    public String getFolder() {
        return this.folder;
    }

    public DescribeUploadInfoResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DescribeUploadInfoResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public DescribeUploadInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUploadInfoResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
