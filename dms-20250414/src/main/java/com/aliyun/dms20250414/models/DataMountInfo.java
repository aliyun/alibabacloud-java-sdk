// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DataMountInfo extends TeaModel {
    /**
     * <p>The name of the mount directory. The actual mount path is prefixed with /Workspace/data/.</p>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("MountFolderName")
    public String mountFolderName;

    /**
     * <p>The name of the OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>test-bucket</p>
     */
    @NameInMap("OssBucket")
    public String ossBucket;

    /**
     * <p>The prefix. If this parameter is not specified, the root directory is used.</p>
     * 
     * <strong>example:</strong>
     * <p>/prod</p>
     */
    @NameInMap("Prefix")
    public String prefix;

    /**
     * <p>Whether to mount the data volume as read-only.</p>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ReadOnly")
    public Boolean readOnly;

    public static DataMountInfo build(java.util.Map<String, ?> map) throws Exception {
        DataMountInfo self = new DataMountInfo();
        return TeaModel.build(map, self);
    }

    public DataMountInfo setMountFolderName(String mountFolderName) {
        this.mountFolderName = mountFolderName;
        return this;
    }
    public String getMountFolderName() {
        return this.mountFolderName;
    }

    public DataMountInfo setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public DataMountInfo setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public DataMountInfo setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }
    public Boolean getReadOnly() {
        return this.readOnly;
    }

}
