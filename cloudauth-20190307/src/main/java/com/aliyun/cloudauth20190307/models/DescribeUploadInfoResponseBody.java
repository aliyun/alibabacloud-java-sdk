// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeUploadInfoResponseBody extends TeaModel {
    @NameInMap("Policy")
    public String policy;

    @NameInMap("Expire")
    public Long expire;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Accessid")
    public String accessid;

    @NameInMap("Signature")
    public String signature;

    @NameInMap("Host")
    public String host;

    @NameInMap("Folder")
    public String folder;

    public static DescribeUploadInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUploadInfoResponseBody self = new DescribeUploadInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUploadInfoResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public DescribeUploadInfoResponseBody setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public DescribeUploadInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUploadInfoResponseBody setAccessid(String accessid) {
        this.accessid = accessid;
        return this;
    }
    public String getAccessid() {
        return this.accessid;
    }

    public DescribeUploadInfoResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public DescribeUploadInfoResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DescribeUploadInfoResponseBody setFolder(String folder) {
        this.folder = folder;
        return this;
    }
    public String getFolder() {
        return this.folder;
    }

}
