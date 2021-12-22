// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UnassociateEipAddressRequest extends TeaModel {
    @NameInMap("Eip")
    public String eip;

    @NameInMap("EnsRegionId")
    public String ensRegionId;

    @NameInMap("InstanceIdInternetIp")
    public String instanceIdInternetIp;

    @NameInMap("Version")
    public String version;

    public static UnassociateEipAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        UnassociateEipAddressRequest self = new UnassociateEipAddressRequest();
        return TeaModel.build(map, self);
    }

    public UnassociateEipAddressRequest setEip(String eip) {
        this.eip = eip;
        return this;
    }
    public String getEip() {
        return this.eip;
    }

    public UnassociateEipAddressRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public UnassociateEipAddressRequest setInstanceIdInternetIp(String instanceIdInternetIp) {
        this.instanceIdInternetIp = instanceIdInternetIp;
        return this;
    }
    public String getInstanceIdInternetIp() {
        return this.instanceIdInternetIp;
    }

    public UnassociateEipAddressRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
