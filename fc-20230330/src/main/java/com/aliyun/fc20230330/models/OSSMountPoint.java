// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class OSSMountPoint extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>my-bucket</p>
     */
    @NameInMap("bucketName")
    public String bucketName;

    /**
     * <strong>example:</strong>
     * <p>/my-dir</p>
     */
    @NameInMap("bucketPath")
    public String bucketPath;

    /**
     * <strong>example:</strong>
     * <p><a href="http://oss-cn-shanghai.aliyuncs.com">http://oss-cn-shanghai.aliyuncs.com</a></p>
     */
    @NameInMap("endpoint")
    public String endpoint;

    /**
     * <strong>example:</strong>
     * <p>/mnt/dir</p>
     */
    @NameInMap("mountDir")
    public String mountDir;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("readOnly")
    public Boolean readOnly;

    public static OSSMountPoint build(java.util.Map<String, ?> map) throws Exception {
        OSSMountPoint self = new OSSMountPoint();
        return TeaModel.build(map, self);
    }

    public OSSMountPoint setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public OSSMountPoint setBucketPath(String bucketPath) {
        this.bucketPath = bucketPath;
        return this;
    }
    public String getBucketPath() {
        return this.bucketPath;
    }

    public OSSMountPoint setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public OSSMountPoint setMountDir(String mountDir) {
        this.mountDir = mountDir;
        return this;
    }
    public String getMountDir() {
        return this.mountDir;
    }

    public OSSMountPoint setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }
    public Boolean getReadOnly() {
        return this.readOnly;
    }

}
