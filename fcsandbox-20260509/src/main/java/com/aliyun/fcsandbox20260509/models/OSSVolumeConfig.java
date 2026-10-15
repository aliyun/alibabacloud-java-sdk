// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class OSSVolumeConfig extends TeaModel {
    /**
     * <p>The name of the OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>example-bucket</p>
     */
    @NameInMap("bucketName")
    public String bucketName;

    /**
     * <p>The path to mount within the bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>/agent-workspace</p>
     */
    @NameInMap("bucketPath")
    public String bucketPath;

    /**
     * <p>The OSS access endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oss-cn-hangzhou.aliyuncs.com">https://oss-cn-hangzhou.aliyuncs.com</a></p>
     */
    @NameInMap("endpoint")
    public String endpoint;

    /**
     * <p>Specifies whether to mount the volume in read-only mode.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
