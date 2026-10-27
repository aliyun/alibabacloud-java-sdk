// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class VerifyAgentCodePackageOssRamAuthorizationRequest extends TeaModel {
    /**
     * <p>The name of the source OSS bucket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-bucket</p>
     */
    @NameInMap("ossBucketName")
    public String ossBucketName;

    public static VerifyAgentCodePackageOssRamAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyAgentCodePackageOssRamAuthorizationRequest self = new VerifyAgentCodePackageOssRamAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public VerifyAgentCodePackageOssRamAuthorizationRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

}
