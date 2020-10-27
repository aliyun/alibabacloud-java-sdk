// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateVpcResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    @NameInMap("VRouterId")
    @Validation(required = true)
    public String VRouterId;

    @NameInMap("RouteTableId")
    @Validation(required = true)
    public String routeTableId;

    public static CreateVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcResponse self = new CreateVpcResponse();
        return TeaModel.build(map, self);
    }

    public CreateVpcResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVpcResponse setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateVpcResponse setVRouterId(String VRouterId) {
        this.VRouterId = VRouterId;
        return this;
    }
    public String getVRouterId() {
        return this.VRouterId;
    }

    public CreateVpcResponse setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

}
