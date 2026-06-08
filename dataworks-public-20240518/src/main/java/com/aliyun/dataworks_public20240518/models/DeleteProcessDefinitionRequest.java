// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteProcessDefinitionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f0d6d578-a305-40ac-ba1e-0a09f64cbc69</p>
     */
    @NameInMap("Id")
    public String id;

    public static DeleteProcessDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProcessDefinitionRequest self = new DeleteProcessDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProcessDefinitionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
