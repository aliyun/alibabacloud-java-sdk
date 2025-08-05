// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyPrivateDnsEndpointRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pd-12345</p>
     */
    @NameInMap("AccessInstanceId")
    public String accessInstanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccessInstanceName")
    public String accessInstanceName;

    /**
     * <strong>example:</strong>
     * <p>1.1.1.1</p>
     */
    @NameInMap("PrimaryDns")
    public String primaryDns;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("PrivateDnsType")
    public String privateDnsType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <strong>example:</strong>
     * <p>1.1.1.2</p>
     */
    @NameInMap("StandbyDns")
    public String standbyDns;

    public static ModifyPrivateDnsEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrivateDnsEndpointRequest self = new ModifyPrivateDnsEndpointRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPrivateDnsEndpointRequest setAccessInstanceId(String accessInstanceId) {
        this.accessInstanceId = accessInstanceId;
        return this;
    }
    public String getAccessInstanceId() {
        return this.accessInstanceId;
    }

    public ModifyPrivateDnsEndpointRequest setAccessInstanceName(String accessInstanceName) {
        this.accessInstanceName = accessInstanceName;
        return this;
    }
    public String getAccessInstanceName() {
        return this.accessInstanceName;
    }

    public ModifyPrivateDnsEndpointRequest setPrimaryDns(String primaryDns) {
        this.primaryDns = primaryDns;
        return this;
    }
    public String getPrimaryDns() {
        return this.primaryDns;
    }

    public ModifyPrivateDnsEndpointRequest setPrivateDnsType(String privateDnsType) {
        this.privateDnsType = privateDnsType;
        return this;
    }
    public String getPrivateDnsType() {
        return this.privateDnsType;
    }

    public ModifyPrivateDnsEndpointRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public ModifyPrivateDnsEndpointRequest setStandbyDns(String standbyDns) {
        this.standbyDns = standbyDns;
        return this;
    }
    public String getStandbyDns() {
        return this.standbyDns;
    }

}
