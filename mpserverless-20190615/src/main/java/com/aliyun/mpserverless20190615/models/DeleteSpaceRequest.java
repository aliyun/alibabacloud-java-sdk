// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteSpaceRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    public static DeleteSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSpaceRequest self = new DeleteSpaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSpaceRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
