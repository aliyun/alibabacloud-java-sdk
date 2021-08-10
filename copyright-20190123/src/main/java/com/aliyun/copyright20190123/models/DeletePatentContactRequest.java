// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class DeletePatentContactRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static DeletePatentContactRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePatentContactRequest self = new DeletePatentContactRequest();
        return TeaModel.build(map, self);
    }

    public DeletePatentContactRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
