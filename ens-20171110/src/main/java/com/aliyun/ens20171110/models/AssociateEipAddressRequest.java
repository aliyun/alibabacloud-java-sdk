// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AssociateEipAddressRequest extends TeaModel {
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

    public static AssociateEipAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateEipAddressRequest self = new AssociateEipAddressRequest();
        return TeaModel.build(map, self);
    }

    public AssociateEipAddressRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public AssociateEipAddressRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public AssociateEipAddressRequest setEip(String eip) {
        this.eip = eip;
        return this;
    }
    public String getEip() {
        return this.eip;
    }

    public AssociateEipAddressRequest setInstanceIdInternetIp(String instanceIdInternetIp) {
        this.instanceIdInternetIp = instanceIdInternetIp;
        return this;
    }
    public String getInstanceIdInternetIp() {
        return this.instanceIdInternetIp;
    }

}
