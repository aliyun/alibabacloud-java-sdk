// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DeleteMaterialRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static DeleteMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMaterialRequest self = new DeleteMaterialRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMaterialRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
