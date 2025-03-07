// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteAdInsertionRequest extends TeaModel {
    /**
     * <p>The name of the configuration that you want to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_ad</p>
     */
    @NameInMap("Name")
    public String name;

    public static DeleteAdInsertionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAdInsertionRequest self = new DeleteAdInsertionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAdInsertionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
