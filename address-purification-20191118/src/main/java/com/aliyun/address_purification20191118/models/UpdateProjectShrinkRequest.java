// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.address_purification20191118.models;

import com.aliyun.tea.*;

public class UpdateProjectShrinkRequest extends TeaModel {
    @NameInMap("ServiceCode")
    @Validation(required = true)
    public String serviceCode;

    @NameInMap("Parameters")
    @Validation(required = true)
    public String parametersShrink;

    public static UpdateProjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectShrinkRequest self = new UpdateProjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectShrinkRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public UpdateProjectShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

}
