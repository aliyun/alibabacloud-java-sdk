// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class DeleteImageDbRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    public static DeleteImageDbRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageDbRequest self = new DeleteImageDbRequest();
        return TeaModel.build(map, self);
    }

    public DeleteImageDbRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
