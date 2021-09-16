// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RpcListInstanceRequest extends TeaModel {
    @NameInMap("esVersion")
    public String esVersion;

    @NameInMap("vpcId")
    public String vpcId;

    @NameInMap("vswitchId")
    public String vswitchId;

    public static RpcListInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RpcListInstanceRequest self = new RpcListInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RpcListInstanceRequest setEsVersion(String esVersion) {
        this.esVersion = esVersion;
        return this;
    }
    public String getEsVersion() {
        return this.esVersion;
    }

    public RpcListInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public RpcListInstanceRequest setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

}
