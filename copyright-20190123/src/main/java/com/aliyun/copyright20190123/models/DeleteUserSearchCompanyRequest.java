// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class DeleteUserSearchCompanyRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static DeleteUserSearchCompanyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserSearchCompanyRequest self = new DeleteUserSearchCompanyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserSearchCompanyRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
