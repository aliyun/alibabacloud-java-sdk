// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetAgentCodePackageOssRamAuthorizeUrlRequest extends TeaModel {
    /**
     * <p>The name of the source OSS bucket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-bucket</p>
     */
    @NameInMap("ossBucketName")
    public String ossBucketName;

    public static GetAgentCodePackageOssRamAuthorizeUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentCodePackageOssRamAuthorizeUrlRequest self = new GetAgentCodePackageOssRamAuthorizeUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentCodePackageOssRamAuthorizeUrlRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

}
