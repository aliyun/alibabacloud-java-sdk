// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CloneModuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mod-148e7853433574fff6b316f4eb737e</p>
     */
    @NameInMap("moduleId")
    public String moduleId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>market</p>
     */
    @NameInMap("moduleSource")
    public String moduleSource;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("moduleVersion")
    public String moduleVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
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
