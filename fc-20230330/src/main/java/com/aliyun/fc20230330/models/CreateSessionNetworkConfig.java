// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateSessionNetworkConfig extends TeaModel {
    @NameInMap("allowOut")
    public java.util.List<String> allowOut;

    @NameInMap("allowPublicTraffic")
    public Boolean allowPublicTraffic;

    @NameInMap("denyOut")
    public java.util.List<String> denyOut;

    @NameInMap("maskRequestHost")
    public String maskRequestHost;

    public static CreateSessionNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
        CreateSessionNetworkConfig self = new CreateSessionNetworkConfig();
        return TeaModel.build(map, self);
    }

    public CreateSessionNetworkConfig setAllowOut(java.util.List<String> allowOut) {
        this.allowOut = allowOut;
        return this;
    }
    public java.util.List<String> getAllowOut() {
        return this.allowOut;
    }

    public CreateSessionNetworkConfig setAllowPublicTraffic(Boolean allowPublicTraffic) {
        this.allowPublicTraffic = allowPublicTraffic;
        return this;
    }
    public Boolean getAllowPublicTraffic() {
        return this.allowPublicTraffic;
    }

    public CreateSessionNetworkConfig setDenyOut(java.util.List<String> denyOut) {
        this.denyOut = denyOut;
        return this;
    }
    public java.util.List<String> getDenyOut() {
        return this.denyOut;
    }

    public CreateSessionNetworkConfig setMaskRequestHost(String maskRequestHost) {
        this.maskRequestHost = maskRequestHost;
        return this;
    }
    public String getMaskRequestHost() {
        return this.maskRequestHost;
    }

}
