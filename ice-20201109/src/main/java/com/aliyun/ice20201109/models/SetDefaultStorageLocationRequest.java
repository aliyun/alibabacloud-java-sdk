// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetDefaultStorageLocationRequest extends TeaModel {
    /**
     * <p>The name of the OSS bucket that you created.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-test-bucket</p>
     */
    @NameInMap("Bucket")
    public String bucket;

    /**
     * <ul>
     * <li>When StorageType is set to user_oss_bucket, temporary files are stored in this path. If the path is empty or set to /, files are stored in the root directory.</li>
     * <li>This field does not take effect for VOD storage.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ims/dir</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The storage type. Valid values:</p>
     * <ul>
     * <li>vod_oss_bucket: VOD-managed bucket. You can add VOD system buckets and your own OSS buckets that have been added to the VOD system. If no bucket is available, you can create a bucket in the ApsaraVideo VOD console. The ApsaraVideo VOD system assigns a storage address in each storage region. After you activate ApsaraVideo VOD, you must enable the address before you can use it. For more information, see <a href="https://help.aliyun.com/document_detail/86097.html">Manage storage buckets</a>.</li>
     * <li>user_oss_bucket: user-owned private bucket. Before adding an OSS storage address, you must activate OSS and create a storage bucket. For more information, see <a href="https://help.aliyun.com/document_detail/31885.html">Create a bucket in the console</a>.</li>
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
