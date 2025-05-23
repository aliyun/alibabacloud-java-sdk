// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetProvisionConfigRequest extends TeaModel {
    /**
     * <p>The name of the alias.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prod</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    public static GetProvisionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProvisionConfigRequest self = new GetProvisionConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetProvisionConfigRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
