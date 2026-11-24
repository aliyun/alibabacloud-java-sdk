// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteVendorRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleFor")
    public Long roleFor;

    @NameInMap("VendorId")
    public String vendorId;

    @NameInMap("VendorName")
    public String vendorName;

    public static DeleteVendorRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVendorRequest self = new DeleteVendorRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVendorRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteVendorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteVendorRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public DeleteVendorRequest setVendorId(String vendorId) {
        this.vendorId = vendorId;
        return this;
    }
    public String getVendorId() {
        return this.vendorId;
    }

    public DeleteVendorRequest setVendorName(String vendorName) {
        this.vendorName = vendorName;
        return this;
    }
    public String getVendorName() {
        return this.vendorName;
    }

}
