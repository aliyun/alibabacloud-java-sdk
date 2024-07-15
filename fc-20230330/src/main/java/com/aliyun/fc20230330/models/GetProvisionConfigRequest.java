// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class GetProvisionConfigRequest extends TeaModel {
    /**
     * <p>The function alias or LATEST.</p>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
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
