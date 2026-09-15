// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class VerifyWorkspaceOssMountRamAuthorizationRequest extends TeaModel {
    /**
     * <p>The name of the OSS bucket.</p>
     */
    @NameInMap("bucketName")
    public String bucketName;

    public static VerifyWorkspaceOssMountRamAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyWorkspaceOssMountRamAuthorizationRequest self = new VerifyWorkspaceOssMountRamAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public VerifyWorkspaceOssMountRamAuthorizationRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

}
