// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DLSerdeInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;serialize&quot;</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>org.apache.hadoop.hive.serde2.OpenCSVSerde</p>
     */
    @NameInMap("DeserializerClass")
    public String deserializerClass;

    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;serialization.format&quot;: &quot;1&quot;
     * }</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SerdeType")
    public Integer serdeType;

    /**
     * <strong>example:</strong>
     * <p>org.apache.hadoop.hive.serde2.lazy.LazySimpleSerDe</p>
     */
    @NameInMap("SerializationLib")
    public String serializationLib;

    /**
     * <strong>example:</strong>
     * <p>org.apache.hadoop.hive.serde2.lazy.LazySimpleSerDe</p>
     */
    @NameInMap("SerializerClass")
    public String serializerClass;

    public static DLSerdeInfo build(java.util.Map<String, ?> map) throws Exception {
        DLSerdeInfo self = new DLSerdeInfo();
        return TeaModel.build(map, self);
    }

    public DLSerdeInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DLSerdeInfo setDeserializerClass(String deserializerClass) {
        this.deserializerClass = deserializerClass;
        return this;
    }
    public String getDeserializerClass() {
        return this.deserializerClass;
    }

    public DLSerdeInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DLSerdeInfo setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public DLSerdeInfo setSerdeType(Integer serdeType) {
        this.serdeType = serdeType;
        return this;
    }
    public Integer getSerdeType() {
        return this.serdeType;
    }

    public DLSerdeInfo setSerializationLib(String serializationLib) {
        this.serializationLib = serializationLib;
        return this;
    }
    public String getSerializationLib() {
        return this.serializationLib;
    }

    public DLSerdeInfo setSerializerClass(String serializerClass) {
        this.serializerClass = serializerClass;
        return this;
    }
    public String getSerializerClass() {
        return this.serializerClass;
    }

}
