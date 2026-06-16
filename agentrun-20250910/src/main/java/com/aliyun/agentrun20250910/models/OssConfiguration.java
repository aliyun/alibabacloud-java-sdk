// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class OssConfiguration extends TeaModel {
    /**
     * <p>The name of the OSS bucket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a-test-oss</p>
     */
    @NameInMap("bucketName")
    public String bucketName;

    @NameInMap("endpoint")
    public String endpoint;

    /**
     * <p>The mount point for the OSS bucket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/mnt/oss1</p>
     */
    @NameInMap("mountPoint")
    public String mountPoint;

    /**
     * <p>The access permission for the mount point.</p>
     * 
     * <strong>example:</strong>
     * <p>READ_WRITE</p>
     */
    @NameInMap("permission")
    public String permission;

    /**
     * <p>The object prefix or path within the OSS bucket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("prefix")
    public String prefix;

    /**
     * <p>The region where the OSS bucket is located.</p>
     * 
     * <strong>example:</strong>
     * <p>ch-hangzhou</p>
     */
    @NameInMap("region")
    public String region;

    public static OssConfiguration build(java.util.Map<String, ?> map) throws Exception {
        OssConfiguration self = new OssConfiguration();
        return TeaModel.build(map, self);
    }

    public OssConfiguration setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public OssConfiguration setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public OssConfiguration setMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
        return this;
    }
    public String getMountPoint() {
        return this.mountPoint;
    }

    public OssConfiguration setPermission(String permission) {
        this.permission = permission;
        return this;
    }
    public String getPermission() {
        return this.permission;
    }

    public OssConfiguration setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public OssConfiguration setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
