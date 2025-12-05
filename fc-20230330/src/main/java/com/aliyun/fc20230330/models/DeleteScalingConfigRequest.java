// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class DeleteScalingConfigRequest extends TeaModel {
    /**
     * <p>The function alias.</p>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    public static DeleteScalingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScalingConfigRequest self = new DeleteScalingConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScalingConfigRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
