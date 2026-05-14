// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DataMountInfo extends TeaModel {
    @NameInMap("MountFolderName")
    public String mountFolderName;

    @NameInMap("OssBucket")
    public String ossBucket;

    @NameInMap("Prefix")
    public String prefix;

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
