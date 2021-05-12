// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateProductVersionRequest extends TeaModel {
    @NameInMap("compatibleVersions")
    public String compatibleVersions;

    @NameInMap("description")
    public String description;

    @NameInMap("version")
    public String version;

    public static UpdateProductVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductVersionRequest self = new UpdateProductVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductVersionRequest setCompatibleVersions(String compatibleVersions) {
        this.compatibleVersions = compatibleVersions;
        return this;
    }
    public String getCompatibleVersions() {
        return this.compatibleVersions;
    }

    public UpdateProductVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProductVersionRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
