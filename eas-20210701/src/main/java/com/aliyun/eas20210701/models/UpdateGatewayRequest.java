// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateGatewayRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable Internet access. Default value: false.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   false</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("EnableInternet")
    public Boolean enableInternet;

    /**
     * <p>Specifies whether to enable internal network access. Default value: true.</p>
     */
    @NameInMap("EnableIntranet")
    public Boolean enableIntranet;

    /**
     * <p>The instance type used for the private gateway.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The private gateway alias.</p>
     */
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
