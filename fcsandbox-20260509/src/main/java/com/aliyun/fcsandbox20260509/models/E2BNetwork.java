// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class E2BNetwork extends TeaModel {
    @NameInMap("allowOut")
    public java.util.List<String> allowOut;

    @NameInMap("allowPublicTraffic")
    public Boolean allowPublicTraffic;

    @NameInMap("denyOut")
    public java.util.List<String> denyOut;

    @NameInMap("maskRequestHost")
    public String maskRequestHost;

    public static E2BNetwork build(java.util.Map<String, ?> map) throws Exception {
        E2BNetwork self = new E2BNetwork();
        return TeaModel.build(map, self);
    }

    public E2BNetwork setAllowOut(java.util.List<String> allowOut) {
        this.allowOut = allowOut;
        return this;
    }
    public java.util.List<String> getAllowOut() {
        return this.allowOut;
    }

    public E2BNetwork setAllowPublicTraffic(Boolean allowPublicTraffic) {
        this.allowPublicTraffic = allowPublicTraffic;
        return this;
    }
    public Boolean getAllowPublicTraffic() {
        return this.allowPublicTraffic;
    }

    public E2BNetwork setDenyOut(java.util.List<String> denyOut) {
        this.denyOut = denyOut;
        return this;
    }
    public java.util.List<String> getDenyOut() {
        return this.denyOut;
    }

    public E2BNetwork setMaskRequestHost(String maskRequestHost) {
        this.maskRequestHost = maskRequestHost;
        return this;
    }
    public String getMaskRequestHost() {
        return this.maskRequestHost;
    }

}
