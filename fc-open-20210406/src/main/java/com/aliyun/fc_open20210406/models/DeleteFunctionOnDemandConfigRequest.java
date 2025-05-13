// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class DeleteFunctionOnDemandConfigRequest extends TeaModel {
    /**
     * <p>The service alias or LATEST. Versions are not supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prod</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    public static DeleteFunctionOnDemandConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFunctionOnDemandConfigRequest self = new DeleteFunctionOnDemandConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFunctionOnDemandConfigRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
