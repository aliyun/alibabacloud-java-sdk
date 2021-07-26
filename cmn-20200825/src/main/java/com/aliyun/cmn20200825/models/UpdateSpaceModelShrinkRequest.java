// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateSpaceModelShrinkRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 物理空间类型
    @NameInMap("SpaceType")
    public String spaceType;

    // 资源uuid
    @NameInMap("SpaceModelId")
    public String spaceModelId;

    // 层级
    @NameInMap("Sort")
    public String sortShrink;

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

    public UpdateSpaceModelShrinkRequest setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

    public UpdateSpaceModelShrinkRequest setSpaceModelId(String spaceModelId) {
        this.spaceModelId = spaceModelId;
        return this;
    }
    public String getSpaceModelId() {
        return this.spaceModelId;
    }

    public UpdateSpaceModelShrinkRequest setSortShrink(String sortShrink) {
        this.sortShrink = sortShrink;
        return this;
    }
    public String getSortShrink() {
        return this.sortShrink;
    }

}
