// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteVendorRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region where the Data Management Center of your threat analysis service is located. Select a region for the Management Center based on the region of your asset. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Your asset is in the Chinese mainland.</p>
     * </li>
     * <li><p>ap-southeast-1: Your asset is in a region outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of the member. This parameter is used when an administrator switches to the perspective of a member.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The vendor ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vd-qlsw5eocx94w9</p>
     */
    @NameInMap("VendorId")
    public String vendorId;

    /**
     * <p>The vendor name.</p>
     * 
     * <strong>example:</strong>
     * <p>111</p>
     */
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
