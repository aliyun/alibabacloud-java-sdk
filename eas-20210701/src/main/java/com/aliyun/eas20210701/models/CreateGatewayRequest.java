// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateGatewayRequest extends TeaModel {
    @NameInMap("ResourceName")
    public String resourceName;

    @NameInMap("EnableInternet")
    public Boolean enableInternet;

    @NameInMap("EnableIntranet")
    public Boolean enableIntranet;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("Name")
    public String name;

    public static CreateGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayRequest self = new CreateGatewayRequest();
        return TeaModel.build(map, self);
    }

    public CreateGatewayRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public CreateGatewayRequest setEnableInternet(Boolean enableInternet) {
        this.enableInternet = enableInternet;
        return this;
    }
    public Boolean getEnableInternet() {
        return this.enableInternet;
    }

    public CreateGatewayRequest setEnableIntranet(Boolean enableIntranet) {
        this.enableIntranet = enableIntranet;
        return this;
    }
    public Boolean getEnableIntranet() {
        return this.enableIntranet;
    }

    public CreateGatewayRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateGatewayRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
