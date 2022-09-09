// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateModuleMarketRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("codeUrl")
    public String codeUrl;

    @NameInMap("description")
    public String description;

    @NameInMap("moduleDetail")
    public String moduleDetail;

    @NameInMap("moduleId")
    public String moduleId;

    @NameInMap("moduleVersion")
    public String moduleVersion;

    @NameInMap("name")
    public String name;

    public static CreateModuleMarketRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModuleMarketRequest self = new CreateModuleMarketRequest();
        return TeaModel.build(map, self);
    }

    public CreateModuleMarketRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateModuleMarketRequest setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
        return this;
    }
    public String getCodeUrl() {
        return this.codeUrl;
    }

    public CreateModuleMarketRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateModuleMarketRequest setModuleDetail(String moduleDetail) {
        this.moduleDetail = moduleDetail;
        return this;
    }
    public String getModuleDetail() {
        return this.moduleDetail;
    }

    public CreateModuleMarketRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public CreateModuleMarketRequest setModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
        return this;
    }
    public String getModuleVersion() {
        return this.moduleVersion;
    }

    public CreateModuleMarketRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
