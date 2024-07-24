// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class DeleteDictRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a.dic</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MAIN</p>
     */
    @NameInMap("type")
    public String type;

    public static DeleteDictRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDictRequest self = new DeleteDictRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDictRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteDictRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
