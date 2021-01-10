// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetDepartmentRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static GetDepartmentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDepartmentRequest self = new GetDepartmentRequest();
        return TeaModel.build(map, self);
    }

    public GetDepartmentRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
