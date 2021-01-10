// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateCustomizedFilterRequest extends TeaModel {
    @NameInMap("VersionType")
    public String versionType;

    @NameInMap("BlackWhiteType")
    public String blackWhiteType;

    @NameInMap("Value")
    public String value;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ValueCompareType")
    public String valueCompareType;

    @NameInMap("Name")
    public String name;

    @NameInMap("ValueType")
    public String valueType;

    @NameInMap("VersionId")
    public String versionId;

    public static CreateCustomizedFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomizedFilterRequest self = new CreateCustomizedFilterRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomizedFilterRequest setVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }
    public String getVersionType() {
        return this.versionType;
    }

    public CreateCustomizedFilterRequest setBlackWhiteType(String blackWhiteType) {
        this.blackWhiteType = blackWhiteType;
        return this;
    }
    public String getBlackWhiteType() {
        return this.blackWhiteType;
    }

    public CreateCustomizedFilterRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public CreateCustomizedFilterRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateCustomizedFilterRequest setValueCompareType(String valueCompareType) {
        this.valueCompareType = valueCompareType;
        return this;
    }
    public String getValueCompareType() {
        return this.valueCompareType;
    }

    public CreateCustomizedFilterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCustomizedFilterRequest setValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }
    public String getValueType() {
        return this.valueType;
    }

    public CreateCustomizedFilterRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
