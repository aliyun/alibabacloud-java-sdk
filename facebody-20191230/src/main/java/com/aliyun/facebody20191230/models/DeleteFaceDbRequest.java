// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeleteFaceDbRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    public static DeleteFaceDbRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceDbRequest self = new DeleteFaceDbRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFaceDbRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
