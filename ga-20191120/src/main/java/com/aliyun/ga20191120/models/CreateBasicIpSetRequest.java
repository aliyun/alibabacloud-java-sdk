// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicIpSetRequest extends TeaModel {
    // 加速地域Id
    @NameInMap("AccelerateRegionId")
    public String accelerateRegionId;

    // 基础版全球加速实例Id
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    // 客户端Token
    @NameInMap("ClientToken")
    public String clientToken;

    // RegionId
    @NameInMap("RegionId")
    public String regionId;

    public static CreateBasicIpSetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicIpSetRequest self = new CreateBasicIpSetRequest();
        return TeaModel.build(map, self);
    }

    public CreateBasicIpSetRequest setAccelerateRegionId(String accelerateRegionId) {
        this.accelerateRegionId = accelerateRegionId;
        return this;
    }
    public String getAccelerateRegionId() {
        return this.accelerateRegionId;
    }

    public CreateBasicIpSetRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateBasicIpSetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateBasicIpSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
