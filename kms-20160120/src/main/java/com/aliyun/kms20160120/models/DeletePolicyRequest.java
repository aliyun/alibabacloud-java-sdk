// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeletePolicyRequest extends TeaModel {
    /**
     * <p>The name of the permission policy that you want to delete.</p>
     */
    @NameInMap("Name")
    public String name;

    public static DeletePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyRequest self = new DeletePolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeletePolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
