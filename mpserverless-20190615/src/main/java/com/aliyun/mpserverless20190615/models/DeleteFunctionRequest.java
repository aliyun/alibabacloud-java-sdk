// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteFunctionRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("SpaceId")
    public String spaceId;

    public static DeleteFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFunctionRequest self = new DeleteFunctionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFunctionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteFunctionRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
