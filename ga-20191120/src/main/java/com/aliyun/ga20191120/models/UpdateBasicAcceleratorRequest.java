// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateBasicAcceleratorRequest extends TeaModel {
    // 全球加速实例Id
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    // 客户端Token
    @NameInMap("ClientToken")
    public String clientToken;

    // 全球加速实例描述
    @NameInMap("Description")
    public String description;

    // 全球加速实例名称
    @NameInMap("Name")
    public String name;

    // RegionId
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateBasicAcceleratorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBasicAcceleratorRequest self = new UpdateBasicAcceleratorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBasicAcceleratorRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public UpdateBasicAcceleratorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateBasicAcceleratorRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateBasicAcceleratorRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateBasicAcceleratorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
