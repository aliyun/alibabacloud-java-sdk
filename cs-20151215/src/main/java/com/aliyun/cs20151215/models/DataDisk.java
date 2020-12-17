// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DataDisk extends TeaModel {
    // 数据盘类型
    @NameInMap("category")
    public String category;

    // 数据盘大小，取值范围：40～32767
    @NameInMap("size")
    public Long size;

    // 是否对数据盘加密。
    @NameInMap("encrypted")
    public String encrypted;

    // 开启云盘备份时的自动备份策略。
    @NameInMap("auto_snapshot_policy_id")
    public String autoSnapshotPolicyId;

    public static DataDisk build(java.util.Map<String, ?> map) throws Exception {
        DataDisk self = new DataDisk();
        return TeaModel.build(map, self);
    }

    public DataDisk setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DataDisk setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public DataDisk setEncrypted(String encrypted) {
        this.encrypted = encrypted;
        return this;
    }
    public String getEncrypted() {
        return this.encrypted;
    }

    public DataDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
        this.autoSnapshotPolicyId = autoSnapshotPolicyId;
        return this;
    }
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

}
