// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UnassociateEipAddressRequest extends TeaModel {
    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    @NameInMap("EnsRegionId")
    @Validation(required = true)
    public String ensRegionId;

    @NameInMap("Eip")
    @Validation(required = true)
    public String eip;

    @NameInMap("InstanceIdInternetIp")
    @Validation(required = true)
    public String instanceIdInternetIp;

    public static UnassociateEipAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        UnassociateEipAddressRequest self = new UnassociateEipAddressRequest();
        return TeaModel.build(map, self);
    }

    public UnassociateEipAddressRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public UnassociateEipAddressRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public UnassociateEipAddressRequest setEip(String eip) {
        this.eip = eip;
        return this;
    }
    public String getEip() {
        return this.eip;
    }

    public UnassociateEipAddressRequest setInstanceIdInternetIp(String instanceIdInternetIp) {
        this.instanceIdInternetIp = instanceIdInternetIp;
        return this;
    }
    public String getInstanceIdInternetIp() {
        return this.instanceIdInternetIp;
    }

}
