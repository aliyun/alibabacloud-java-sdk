// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateGatewayRequest extends TeaModel {
    @NameInMap("EnableInternet")
    public Boolean enableInternet;

    @NameInMap("EnableIntranet")
    public Boolean enableIntranet;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("Name")
    public String name;

    public static UpdateGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRequest self = new UpdateGatewayRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRequest setEnableInternet(Boolean enableInternet) {
        this.enableInternet = enableInternet;
        return this;
    }
    public Boolean getEnableInternet() {
        return this.enableInternet;
    }

    public UpdateGatewayRequest setEnableIntranet(Boolean enableIntranet) {
        this.enableIntranet = enableIntranet;
        return this;
    }
    public Boolean getEnableIntranet() {
        return this.enableIntranet;
    }

    public UpdateGatewayRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public UpdateGatewayRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
