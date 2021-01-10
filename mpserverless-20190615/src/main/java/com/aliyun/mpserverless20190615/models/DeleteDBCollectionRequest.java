// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteDBCollectionRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("Body")
    public String body;

    public static DeleteDBCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBCollectionRequest self = new DeleteDBCollectionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDBCollectionRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public DeleteDBCollectionRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
