// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateCustomizedPropertyRequest extends TeaModel {
    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Value")
    public String value;

    @NameInMap("VersionType")
    public String versionType;

    public static CreateCustomizedPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomizedPropertyRequest self = new CreateCustomizedPropertyRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomizedPropertyRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public CreateCustomizedPropertyRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateCustomizedPropertyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCustomizedPropertyRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public CreateCustomizedPropertyRequest setVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }
    public String getVersionType() {
        return this.versionType;
    }

}
