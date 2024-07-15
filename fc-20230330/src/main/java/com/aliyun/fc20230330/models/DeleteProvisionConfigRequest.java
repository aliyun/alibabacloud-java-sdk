// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class DeleteProvisionConfigRequest extends TeaModel {
    /**
     * <p>The function alias or LATEST.</p>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    public static DeleteProvisionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProvisionConfigRequest self = new DeleteProvisionConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProvisionConfigRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
