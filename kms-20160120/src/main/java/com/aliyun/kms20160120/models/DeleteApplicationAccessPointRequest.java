// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteApplicationAccessPointRequest extends TeaModel {
    /**
     * <p>The name of the AAP that you want to delete.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    public static DeleteApplicationAccessPointRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationAccessPointRequest self = new DeleteApplicationAccessPointRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationAccessPointRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
