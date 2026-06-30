// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetRayLogRequest extends TeaModel {
    /**
     * <p>The bucket name.</p>
     * 
     * <strong>example:</strong>
     * <p>mybucket</p>
     */
    @NameInMap("bucketName")
    public String bucketName;

    /**
     * <p>The log file path.</p>
     * 
     * <strong>example:</strong>
     * <p>/w-xxxxxxx/ray/logs/rj-xxxxxxxxxx_default/xxxx/rj-xxxx_driver.log</p>
     */
    @NameInMap("path")
    public String path;

    public static GetRayLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRayLogRequest self = new GetRayLogRequest();
        return TeaModel.build(map, self);
    }

    public GetRayLogRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public GetRayLogRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

}
