// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateVendorRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleFor")
    public Long roleFor;

    @NameInMap("VendorName")
    public String vendorName;

    public static CreateVendorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVendorRequest self = new CreateVendorRequest();
        return TeaModel.build(map, self);
    }

    public CreateVendorRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateVendorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVendorRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public CreateVendorRequest setVendorName(String vendorName) {
        this.vendorName = vendorName;
        return this;
    }
    public String getVendorName() {
        return this.vendorName;
    }

}
