// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateSpaceModelShrinkRequest extends TeaModel {
    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 层级
    @NameInMap("Sort")
    public String sortShrink;

    // 物理空间类型
    @NameInMap("SpaceType")
    public String spaceType;

    public static CreateSpaceModelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSpaceModelShrinkRequest self = new CreateSpaceModelShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSpaceModelShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateSpaceModelShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSpaceModelShrinkRequest setSortShrink(String sortShrink) {
        this.sortShrink = sortShrink;
        return this;
    }
    public String getSortShrink() {
        return this.sortShrink;
    }

    public CreateSpaceModelShrinkRequest setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

}
