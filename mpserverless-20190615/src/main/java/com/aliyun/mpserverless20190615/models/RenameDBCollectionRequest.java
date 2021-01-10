// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class RenameDBCollectionRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("OriginCollection")
    public String originCollection;

    @NameInMap("NewCollection")
    public String newCollection;

    public static RenameDBCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        RenameDBCollectionRequest self = new RenameDBCollectionRequest();
        return TeaModel.build(map, self);
    }

    public RenameDBCollectionRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public RenameDBCollectionRequest setOriginCollection(String originCollection) {
        this.originCollection = originCollection;
        return this;
    }
    public String getOriginCollection() {
        return this.originCollection;
    }

    public RenameDBCollectionRequest setNewCollection(String newCollection) {
        this.newCollection = newCollection;
        return this;
    }
    public String getNewCollection() {
        return this.newCollection;
    }

}
