// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateProductVersionRequest extends TeaModel {
    @NameInMap("baseProductVersionUID")
    public String baseProductVersionUID;

    @NameInMap("version")
    public String version;

    @NameInMap("withoutBaseProductVersion")
    public Boolean withoutBaseProductVersion;

    public static CreateProductVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductVersionRequest self = new CreateProductVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductVersionRequest setBaseProductVersionUID(String baseProductVersionUID) {
        this.baseProductVersionUID = baseProductVersionUID;
        return this;
    }
    public String getBaseProductVersionUID() {
        return this.baseProductVersionUID;
    }

    public CreateProductVersionRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public CreateProductVersionRequest setWithoutBaseProductVersion(Boolean withoutBaseProductVersion) {
        this.withoutBaseProductVersion = withoutBaseProductVersion;
        return this;
    }
    public Boolean getWithoutBaseProductVersion() {
        return this.withoutBaseProductVersion;
    }

}
