// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateConfigurationRecorderRequest extends TeaModel {
    /**
     * <p>The resource types. Separate multiple resource types with commas (,).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceTypes")
    public String resourceTypes;

    public static UpdateConfigurationRecorderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigurationRecorderRequest self = new UpdateConfigurationRecorderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConfigurationRecorderRequest setResourceTypes(String resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public String getResourceTypes() {
        return this.resourceTypes;
    }

}
