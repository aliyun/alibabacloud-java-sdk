// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateModuleRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("ModuleName")
    public String moduleName;

    @NameInMap("TargetAppSource")
    public String targetAppSource;

    public static CreateModuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModuleRequest self = new CreateModuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateModuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateModuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateModuleRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public CreateModuleRequest setTargetAppSource(String targetAppSource) {
        this.targetAppSource = targetAppSource;
        return this;
    }
    public String getTargetAppSource() {
        return this.targetAppSource;
    }

}
