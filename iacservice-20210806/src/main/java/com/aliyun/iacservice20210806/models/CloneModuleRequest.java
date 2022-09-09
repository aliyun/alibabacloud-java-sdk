// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CloneModuleRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("moduleId")
    public String moduleId;

    @NameInMap("moduleSource")
    public String moduleSource;

    @NameInMap("moduleVersion")
    public String moduleVersion;

    @NameInMap("name")
    public String name;

    public static CloneModuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneModuleRequest self = new CloneModuleRequest();
        return TeaModel.build(map, self);
    }

    public CloneModuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CloneModuleRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public CloneModuleRequest setModuleSource(String moduleSource) {
        this.moduleSource = moduleSource;
        return this;
    }
    public String getModuleSource() {
        return this.moduleSource;
    }

    public CloneModuleRequest setModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
        return this;
    }
    public String getModuleVersion() {
        return this.moduleVersion;
    }

    public CloneModuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
