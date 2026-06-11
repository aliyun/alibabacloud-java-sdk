// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class DataResourceValue extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Type")
    public String type;

    @NameInMap("Content")
    public String content;

    @NameInMap("Metadata")
    public java.util.Map<String, ?> metadata;

    public static DataResourceValue build(java.util.Map<String, ?> map) throws Exception {
        DataResourceValue self = new DataResourceValue();
        return TeaModel.build(map, self);
    }

    public DataResourceValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DataResourceValue setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DataResourceValue setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DataResourceValue setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

}
