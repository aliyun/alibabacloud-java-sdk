// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateCustomizedFilterRequest extends TeaModel {
    @NameInMap("BlackWhiteType")
    public String blackWhiteType;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Value")
    public String value;

    @NameInMap("ValueType")
    public String valueType;

    @NameInMap("ValueCompareType")
    public String valueCompareType;

    @NameInMap("Id")
    public Long id;

    public static UpdateCustomizedFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomizedFilterRequest self = new UpdateCustomizedFilterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomizedFilterRequest setBlackWhiteType(String blackWhiteType) {
        this.blackWhiteType = blackWhiteType;
        return this;
    }
    public String getBlackWhiteType() {
        return this.blackWhiteType;
    }

    public UpdateCustomizedFilterRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateCustomizedFilterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCustomizedFilterRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public UpdateCustomizedFilterRequest setValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }
    public String getValueType() {
        return this.valueType;
    }

    public UpdateCustomizedFilterRequest setValueCompareType(String valueCompareType) {
        this.valueCompareType = valueCompareType;
        return this;
    }
    public String getValueCompareType() {
        return this.valueCompareType;
    }

    public UpdateCustomizedFilterRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
