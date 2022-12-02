// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateSpaceModelShrinkRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Sort")
    public String sortShrink;

    @NameInMap("SpaceModelId")
    public String spaceModelId;

    @NameInMap("SpaceType")
    public String spaceType;

    public static UpdateSpaceModelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpaceModelShrinkRequest self = new UpdateSpaceModelShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSpaceModelShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSpaceModelShrinkRequest setSortShrink(String sortShrink) {
        this.sortShrink = sortShrink;
        return this;
    }
    public String getSortShrink() {
        return this.sortShrink;
    }

    public UpdateSpaceModelShrinkRequest setSpaceModelId(String spaceModelId) {
        this.spaceModelId = spaceModelId;
        return this;
    }
    public String getSpaceModelId() {
        return this.spaceModelId;
    }

    public UpdateSpaceModelShrinkRequest setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

}
