// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateRouteTableRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RouteTableName")
    public String routeTableName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateRouteTableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteTableRequest self = new CreateRouteTableRequest();
        return TeaModel.build(map, self);
    }

    public CreateRouteTableRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRouteTableRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRouteTableRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRouteTableRequest setRouteTableName(String routeTableName) {
        this.routeTableName = routeTableName;
        return this;
    }
    public String getRouteTableName() {
        return this.routeTableName;
    }

    public CreateRouteTableRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
