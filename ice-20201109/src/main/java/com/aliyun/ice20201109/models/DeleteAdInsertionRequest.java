// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteAdInsertionRequest extends TeaModel {
    /**
     * <p>代表资源一级ID的资源属性字段</p>
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
