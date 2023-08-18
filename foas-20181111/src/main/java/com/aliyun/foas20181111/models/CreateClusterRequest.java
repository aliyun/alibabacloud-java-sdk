// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("displayName")
    public String displayName;

    @NameInMap("orderId")
    public String orderId;

    @NameInMap("userOssBucket")
    public String userOssBucket;

    @NameInMap("userVSwitch")
    public String userVSwitch;

    @NameInMap("userVpcId")
    public String userVpcId;

    @NameInMap("zoneId")
    public String zoneId;

    public static CreateClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterRequest self = new CreateClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateClusterRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateClusterRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateClusterRequest setUserOssBucket(String userOssBucket) {
        this.userOssBucket = userOssBucket;
        return this;
    }
    public String getUserOssBucket() {
        return this.userOssBucket;
    }

    public CreateClusterRequest setUserVSwitch(String userVSwitch) {
        this.userVSwitch = userVSwitch;
        return this;
    }
    public String getUserVSwitch() {
        return this.userVSwitch;
    }

    public CreateClusterRequest setUserVpcId(String userVpcId) {
        this.userVpcId = userVpcId;
        return this;
    }
    public String getUserVpcId() {
        return this.userVpcId;
    }

    public CreateClusterRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
