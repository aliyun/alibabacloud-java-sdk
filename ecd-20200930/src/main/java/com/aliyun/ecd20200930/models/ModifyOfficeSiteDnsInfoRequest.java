// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyOfficeSiteDnsInfoRequest extends TeaModel {
    @NameInMap("DnsAddress")
    public java.util.List<String> dnsAddress;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-778418****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyOfficeSiteDnsInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOfficeSiteDnsInfoRequest self = new ModifyOfficeSiteDnsInfoRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOfficeSiteDnsInfoRequest setDnsAddress(java.util.List<String> dnsAddress) {
        this.dnsAddress = dnsAddress;
        return this;
    }
    public java.util.List<String> getDnsAddress() {
        return this.dnsAddress;
    }

    public ModifyOfficeSiteDnsInfoRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ModifyOfficeSiteDnsInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
