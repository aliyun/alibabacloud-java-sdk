// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class FieldSchema extends TeaModel {
    // Comment
    @NameInMap("Comment")
    public String comment;

    // Name
    @NameInMap("Name")
    public String name;

    @NameInMap("Parameters")
    public java.util.Map<String, String> parameters;

    // Type
    @NameInMap("Type")
    public String type;

    public static FieldSchema build(java.util.Map<String, ?> map) throws Exception {
        FieldSchema self = new FieldSchema();
        return TeaModel.build(map, self);
    }

    public FieldSchema setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public FieldSchema setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FieldSchema setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public FieldSchema setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
