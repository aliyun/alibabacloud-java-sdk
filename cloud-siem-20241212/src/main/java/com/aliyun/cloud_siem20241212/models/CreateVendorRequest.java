// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateVendorRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <blockquote>
     * <p>Note: This parameter is required in practice. If you omit it, the API returns a 400 error: &quot;The specified Lang can not be empty.&quot;</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region where the threat analysis data management center is located. Specify the management center based on the region of your assets. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets belong to the Chinese mainland.</li>
     * <li>ap-southeast-1: Your assets belong to regions outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the member account that the administrator switches to.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The vendor name.</p>
     * 
     * <strong>example:</strong>
     * <p>111</p>
     */
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
