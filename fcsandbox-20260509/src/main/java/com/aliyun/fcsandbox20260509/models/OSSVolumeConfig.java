// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class OSSVolumeConfig extends TeaModel {
    @NameInMap("bucketName")
    public String bucketName;

    @NameInMap("bucketPath")
    public String bucketPath;

    @NameInMap("endpoint")
    public String endpoint;

    @NameInMap("readOnly")
    public Boolean readOnly;

    public static OSSVolumeConfig build(java.util.Map<String, ?> map) throws Exception {
        OSSVolumeConfig self = new OSSVolumeConfig();
        return TeaModel.build(map, self);
    }

    public OSSVolumeConfig setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public OSSVolumeConfig setBucketPath(String bucketPath) {
        this.bucketPath = bucketPath;
        return this;
    }
    public String getBucketPath() {
        return this.bucketPath;
    }

    public OSSVolumeConfig setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public OSSVolumeConfig setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }
    public Boolean getReadOnly() {
        return this.readOnly;
    }

}
