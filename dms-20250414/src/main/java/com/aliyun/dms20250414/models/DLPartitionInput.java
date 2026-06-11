// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DLPartitionInput extends TeaModel {
    /**
     * <p>The time when the partition was created. This is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735109884</p>
     */
    @NameInMap("CreateTime")
    public Integer createTime;

    /**
     * <p>The time when the partition was last accessed. This is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735109884</p>
     */
    @NameInMap("LastAccessTime")
    public Integer lastAccessTime;

    /**
     * <p>The key-value pair parameters for the partition.</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, String> parameters;

    /**
     * <p>The data storage information of the data lakehouse table.</p>
     */
    @NameInMap("StorageDescriptor")
    public DLStorageDescriptor storageDescriptor;

    /**
     * <p>The partition values.</p>
     */
    @NameInMap("Values")
    public java.util.List<String> values;

    public static DLPartitionInput build(java.util.Map<String, ?> map) throws Exception {
        DLPartitionInput self = new DLPartitionInput();
        return TeaModel.build(map, self);
    }

    public DLPartitionInput setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }
    public Integer getCreateTime() {
        return this.createTime;
    }

    public DLPartitionInput setLastAccessTime(Integer lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }
    public Integer getLastAccessTime() {
        return this.lastAccessTime;
    }

    public DLPartitionInput setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public DLPartitionInput setStorageDescriptor(DLStorageDescriptor storageDescriptor) {
        this.storageDescriptor = storageDescriptor;
        return this;
    }
    public DLStorageDescriptor getStorageDescriptor() {
        return this.storageDescriptor;
    }

    public DLPartitionInput setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

}
