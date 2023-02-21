// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SerDeInfoModel extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Parameters")
    public java.util.Map<String, String> parameters;

    @NameInMap("SerDeId")
    public Long serDeId;

    @NameInMap("SerializationLib")
    public String serializationLib;

    public static SerDeInfoModel build(java.util.Map<String, ?> map) throws Exception {
        SerDeInfoModel self = new SerDeInfoModel();
        return TeaModel.build(map, self);
    }

    public SerDeInfoModel setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SerDeInfoModel setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public SerDeInfoModel setSerDeId(Long serDeId) {
        this.serDeId = serDeId;
        return this;
    }
    public Long getSerDeId() {
        return this.serDeId;
    }

    public SerDeInfoModel setSerializationLib(String serializationLib) {
        this.serializationLib = serializationLib;
        return this;
    }
    public String getSerializationLib() {
        return this.serializationLib;
    }

}
