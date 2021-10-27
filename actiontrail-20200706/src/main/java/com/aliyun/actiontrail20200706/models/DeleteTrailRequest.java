// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DeleteTrailRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    public static DeleteTrailRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrailRequest self = new DeleteTrailRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTrailRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
