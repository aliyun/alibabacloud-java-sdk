// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateEnvironmentRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("location")
    public String location;

    @NameInMap("vendorConfig")
    public String vendorConfig;

    public static UpdateEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvironmentRequest self = new UpdateEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEnvironmentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateEnvironmentRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public UpdateEnvironmentRequest setVendorConfig(String vendorConfig) {
        this.vendorConfig = vendorConfig;
        return this;
    }
    public String getVendorConfig() {
        return this.vendorConfig;
    }

}
