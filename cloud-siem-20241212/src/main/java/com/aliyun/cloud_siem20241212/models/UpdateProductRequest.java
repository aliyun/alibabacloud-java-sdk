// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateProductRequest extends TeaModel {
    /**
     * <p>The language of the response messages. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English. This parameter is required. If not provided, the service returns a 400 error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The product ID. Only products with ProductType set to custom support updates. System preset products (ProductType set to preset) cannot be modified. Calling this operation on a preset product returns a 403 error. To create a custom product, use the CreateProduct API first. This parameter is the resource identifier for the Update operation and is required. Only custom products can be updated. System preset products cannot be updated.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba_cloud_sas</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The product name.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba_cloud_sas</p>
     */
    @NameInMap("ProductName")
    public String productName;

    /**
     * <p>The region where the data management center of Cloud Threat Detection and Response (CTDR) is located. Select the management center region based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Assets are located in the Chinese mainland.</li>
     * <li>ap-southeast-1: Assets are located outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID that the administrator uses to switch to another member\&quot;s view.</p>
     * 
     * <strong>example:</strong>
     * <p>1733269771123</p>
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

    public static UpdateProductRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductRequest self = new UpdateProductRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateProductRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public UpdateProductRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public UpdateProductRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateProductRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public UpdateProductRequest setVendorName(String vendorName) {
        this.vendorName = vendorName;
        return this;
    }
    public String getVendorName() {
        return this.vendorName;
    }

}
