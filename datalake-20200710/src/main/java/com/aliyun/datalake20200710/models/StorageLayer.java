// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class StorageLayer extends TeaModel {
    // 归档
    @NameInMap("Archive")
    public Long archive;

    // 冷归档
    @NameInMap("ColdArchive")
    public Long coldArchive;

    // 低频
    @NameInMap("Infrequent")
    public Long infrequent;

    // 标准
    @NameInMap("Standard")
    public Long standard;

    public static StorageLayer build(java.util.Map<String, ?> map) throws Exception {
        StorageLayer self = new StorageLayer();
        return TeaModel.build(map, self);
    }

    public StorageLayer setArchive(Long archive) {
        this.archive = archive;
        return this;
    }
    public Long getArchive() {
        return this.archive;
    }

    public StorageLayer setColdArchive(Long coldArchive) {
        this.coldArchive = coldArchive;
        return this;
    }
    public Long getColdArchive() {
        return this.coldArchive;
    }

    public StorageLayer setInfrequent(Long infrequent) {
        this.infrequent = infrequent;
        return this;
    }
    public Long getInfrequent() {
        return this.infrequent;
    }

    public StorageLayer setStandard(Long standard) {
        this.standard = standard;
        return this;
    }
    public Long getStandard() {
        return this.standard;
    }

}
