// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeleteBodyDbRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static DeleteBodyDbRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBodyDbRequest self = new DeleteBodyDbRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBodyDbRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
