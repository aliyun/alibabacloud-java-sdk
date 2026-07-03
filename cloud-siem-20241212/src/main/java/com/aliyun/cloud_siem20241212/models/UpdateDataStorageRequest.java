// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataStorageRequest extends TeaModel {
    /**
     * <p>The log storage region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DataStorageRegionId")
    public String dataStorageRegionId;

    /**
     * <p>The global switch for log delivery in Log Management. This parameter is not yet available. Valid values:</p>
     * <ul>
     * <li><p>enable: Enables global delivery.</p>
     * </li>
     * <li><p>disable: Disables global delivery.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("DeliveryStatus")
    public String deliveryStatus;

    /**
     * <p>The language of the response message. Valid values:</p>
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
     * <p>The region where the Data Management center for threat analysis is located. This region must be the same as the region where your assets are located. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: The assets are in the Chinese mainland.</p>
     * </li>
     * <li><p>ap-southeast-1: The assets are in a region outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of a member. An administrator can specify this parameter to switch to the perspective of the member.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static UpdateDataStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataStorageRequest self = new UpdateDataStorageRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataStorageRequest setDataStorageRegionId(String dataStorageRegionId) {
        this.dataStorageRegionId = dataStorageRegionId;
        return this;
    }
    public String getDataStorageRegionId() {
        return this.dataStorageRegionId;
    }

    public UpdateDataStorageRequest setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
        return this;
    }
    public String getDeliveryStatus() {
        return this.deliveryStatus;
    }

    public UpdateDataStorageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDataStorageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDataStorageRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
