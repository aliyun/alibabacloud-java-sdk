// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class VpcQueryAppServersRequest extends TeaModel {
    @NameInMap("AddressPoolId")
    public String addressPoolId;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("ServerIp")
    public String serverIp;

    public static VpcQueryAppServersRequest build(java.util.Map<String, ?> map) throws Exception {
        VpcQueryAppServersRequest self = new VpcQueryAppServersRequest();
        return TeaModel.build(map, self);
    }

    public VpcQueryAppServersRequest setAddressPoolId(String addressPoolId) {
        this.addressPoolId = addressPoolId;
        return this;
    }
    public String getAddressPoolId() {
        return this.addressPoolId;
    }

    public VpcQueryAppServersRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public VpcQueryAppServersRequest setServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }
    public String getServerIp() {
        return this.serverIp;
    }

}
