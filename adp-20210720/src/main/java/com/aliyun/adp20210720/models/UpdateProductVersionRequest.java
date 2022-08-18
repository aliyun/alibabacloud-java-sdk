// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateProductVersionRequest extends TeaModel {
    @NameInMap("continuousIntegration")
    public Boolean continuousIntegration;

    @NameInMap("description")
    public String description;

    @NameInMap("version")
    public String version;

    public static UpdateProductVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductVersionRequest self = new UpdateProductVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductVersionRequest setContinuousIntegration(Boolean continuousIntegration) {
        this.continuousIntegration = continuousIntegration;
        return this;
    }
    public Boolean getContinuousIntegration() {
        return this.continuousIntegration;
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
