// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateSetupProjectRequest extends TeaModel {
    // 创建时间
    @NameInMap("DeliveryTime")
    public String deliveryTime;

    // 描述
    @NameInMap("Description")
    public String description;

    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 物理空间uId
    @NameInMap("SpaceId")
    public String spaceId;

    public static CreateSetupProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSetupProjectRequest self = new CreateSetupProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateSetupProjectRequest setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
        return this;
    }
    public String getDeliveryTime() {
        return this.deliveryTime;
    }

    public CreateSetupProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSetupProjectRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSetupProjectRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
