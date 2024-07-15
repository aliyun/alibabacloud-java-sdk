// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateLayerVersionInput extends TeaModel {
    @NameInMap("code")
    public InputCodeLocation code;

    @NameInMap("compatibleRuntime")
    public java.util.List<String> compatibleRuntime;

    /**
     * <strong>example:</strong>
     * <p>my first layer</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>Apache</p>
     */
    @NameInMap("license")
    public String license;

    public static CreateLayerVersionInput build(java.util.Map<String, ?> map) throws Exception {
        CreateLayerVersionInput self = new CreateLayerVersionInput();
        return TeaModel.build(map, self);
    }

    public CreateLayerVersionInput setCode(InputCodeLocation code) {
        this.code = code;
        return this;
    }
    public InputCodeLocation getCode() {
        return this.code;
    }

    public CreateLayerVersionInput setCompatibleRuntime(java.util.List<String> compatibleRuntime) {
        this.compatibleRuntime = compatibleRuntime;
        return this;
    }
    public java.util.List<String> getCompatibleRuntime() {
        return this.compatibleRuntime;
    }

    public CreateLayerVersionInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLayerVersionInput setLicense(String license) {
        this.license = license;
        return this;
    }
    public String getLicense() {
        return this.license;
    }

}
