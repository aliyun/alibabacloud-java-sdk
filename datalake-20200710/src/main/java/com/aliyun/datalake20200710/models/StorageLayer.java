// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class StorageLayer extends TeaModel {
    @NameInMap("Archive")
    public Long archive;

    @NameInMap("ColdArchive")
    public Long coldArchive;

    @NameInMap("Infrequent")
    public Long infrequent;

    @NameInMap("Standard")
    public Long standard;

    @NameInMap("Unknown")
    public Long unknown;

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

    public StorageLayer setUnknown(Long unknown) {
        this.unknown = unknown;
        return this;
    }
    public Long getUnknown() {
        return this.unknown;
    }

}
