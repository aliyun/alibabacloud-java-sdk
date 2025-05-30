// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metastore20241012.models;

import com.aliyun.tea.*;

public class StorageFormat extends TeaModel {
    @NameInMap("Avro")
    public Long avro;

    @NameInMap("Csv")
    public Long csv;

    @NameInMap("Delta")
    public Long delta;

    @NameInMap("Hudi")
    public Long hudi;

    @NameInMap("Iceberg")
    public Long iceberg;

    @NameInMap("Json")
    public Long json;

    @NameInMap("Orc")
    public Long orc;

    @NameInMap("Parquet")
    public Long parquet;

    @NameInMap("Uncategorized")
    public Long uncategorized;

    public static StorageFormat build(java.util.Map<String, ?> map) throws Exception {
        StorageFormat self = new StorageFormat();
        return TeaModel.build(map, self);
    }

    public StorageFormat setAvro(Long avro) {
        this.avro = avro;
        return this;
    }
    public Long getAvro() {
        return this.avro;
    }

    public StorageFormat setCsv(Long csv) {
        this.csv = csv;
        return this;
    }
    public Long getCsv() {
        return this.csv;
    }

    public StorageFormat setDelta(Long delta) {
        this.delta = delta;
        return this;
    }
    public Long getDelta() {
        return this.delta;
    }

    public StorageFormat setHudi(Long hudi) {
        this.hudi = hudi;
        return this;
    }
    public Long getHudi() {
        return this.hudi;
    }

    public StorageFormat setIceberg(Long iceberg) {
        this.iceberg = iceberg;
        return this;
    }
    public Long getIceberg() {
        return this.iceberg;
    }

    public StorageFormat setJson(Long json) {
        this.json = json;
        return this;
    }
    public Long getJson() {
        return this.json;
    }

    public StorageFormat setOrc(Long orc) {
        this.orc = orc;
        return this;
    }
    public Long getOrc() {
        return this.orc;
    }

    public StorageFormat setParquet(Long parquet) {
        this.parquet = parquet;
        return this;
    }
    public Long getParquet() {
        return this.parquet;
    }

    public StorageFormat setUncategorized(Long uncategorized) {
        this.uncategorized = uncategorized;
        return this;
    }
    public Long getUncategorized() {
        return this.uncategorized;
    }

}
