// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DeleteFlowRequest extends TeaModel {
    /**
     * <p>The name of the flow. The name can contain only letters, digits, underscores (\_), and hyphens (-). It cannot start with a digit or a hyphen (-). It must be 1 to 128 characters in length.</p>
     */
    @NameInMap("Name")
    public String name;

    public static DeleteFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowRequest self = new DeleteFlowRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFlowRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
