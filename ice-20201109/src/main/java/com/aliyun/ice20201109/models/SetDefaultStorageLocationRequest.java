// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetDefaultStorageLocationRequest extends TeaModel {
    /**
     * <p>The name of the OSS bucket you created.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-test-bucket</p>
     */
    @NameInMap("Bucket")
    public String bucket;

    /**
     * <ul>
     * <li><p>When storageType is set to user_oss_bucket, temporary files are stored under this path. If path is empty or set to /, files are stored in the root directory.</p>
     * </li>
     * <li><p>This field does not take effect for VOD storage.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ims/dir</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>Storage type:</p>
     * <ul>
     * <li><p><strong>vod_oss_bucket</strong>: VOD-managed bucket.<br>
     * Supports adding buckets managed by the VOD system or OSS buckets added within the VOD system. If no active buckets are available, you can add a new bucket in the ApsaraVideo VOD console. After activating ApsaraVideo VOD, the system assigns a storage address in each storage region. You must enable this address before use. For details, see <a href="https://help.aliyun.com/document_detail/86097.html">Manage Storage Buckets</a>.</p>
     * </li>
     * <li><p><strong>user_oss_bucket</strong>: User private bucket. Before adding an Object Storage address, you must activate Object Storage Service (OSS) and create a bucket. For details, see <a href="https://help.aliyun.com/document_detail/31885.html">Create a Bucket in the Console</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>user_oss_bucket</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    public static SetDefaultStorageLocationRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultStorageLocationRequest self = new SetDefaultStorageLocationRequest();
        return TeaModel.build(map, self);
    }

    public SetDefaultStorageLocationRequest setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public SetDefaultStorageLocationRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public SetDefaultStorageLocationRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}
