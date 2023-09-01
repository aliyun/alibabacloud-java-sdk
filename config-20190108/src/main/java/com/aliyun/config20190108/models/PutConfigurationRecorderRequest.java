// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class PutConfigurationRecorderRequest extends TeaModel {
    /**
     * <p>The types of the resources that you want Cloud Config to monitor. Separate multiple resource types with commas (,).</p>
     */
    @NameInMap("ResourceTypes")
    public String resourceTypes;

    public static PutConfigurationRecorderRequest build(java.util.Map<String, ?> map) throws Exception {
        PutConfigurationRecorderRequest self = new PutConfigurationRecorderRequest();
        return TeaModel.build(map, self);
    }

    public PutConfigurationRecorderRequest setResourceTypes(String resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public String getResourceTypes() {
        return this.resourceTypes;
    }

}
