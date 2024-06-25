// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class MigrateClusterRequest extends TeaModel {
    /**
     * <p>The endpoint of the OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>*******.oss-cn-hangzhou.aliyuncs.com</p>
     */
    @NameInMap("oss_bucket_endpoint")
    public String ossBucketEndpoint;

    /**
     * <p>The name of the Object Storage Service (OSS) bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>bucket-****</p>
     */
    @NameInMap("oss_bucket_name")
    public String ossBucketName;

    public static MigrateClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateClusterRequest self = new MigrateClusterRequest();
        return TeaModel.build(map, self);
    }

    public MigrateClusterRequest setOssBucketEndpoint(String ossBucketEndpoint) {
        this.ossBucketEndpoint = ossBucketEndpoint;
        return this;
    }
    public String getOssBucketEndpoint() {
        return this.ossBucketEndpoint;
    }

    public MigrateClusterRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

}
