// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteCustomAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the custom attribute.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom-attribute:biz_owner</p>
     */
    @NameInMap("Id")
    public String id;

    public static DeleteCustomAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomAttributeRequest self = new DeleteCustomAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomAttributeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
