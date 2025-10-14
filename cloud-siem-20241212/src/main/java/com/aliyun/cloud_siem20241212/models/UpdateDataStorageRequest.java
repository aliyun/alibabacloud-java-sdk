// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataStorageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DataStorageRegionId")
    public String dataStorageRegionId;

    /**
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("DeliveryStatus")
    public String deliveryStatus;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
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
