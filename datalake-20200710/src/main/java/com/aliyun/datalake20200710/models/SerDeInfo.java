// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class SerDeInfo extends TeaModel {
    // Name
    @NameInMap("Name")
    public String name;

    @NameInMap("Parameters")
    public java.util.Map<String, String> parameters;

    // SerializationLib
    @NameInMap("SerializationLib")
    public String serializationLib;

    public static SerDeInfo build(java.util.Map<String, ?> map) throws Exception {
        SerDeInfo self = new SerDeInfo();
        return TeaModel.build(map, self);
    }

    public SerDeInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SerDeInfo setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public SerDeInfo setSerializationLib(String serializationLib) {
        this.serializationLib = serializationLib;
        return this;
    }
    public String getSerializationLib() {
        return this.serializationLib;
    }

}
