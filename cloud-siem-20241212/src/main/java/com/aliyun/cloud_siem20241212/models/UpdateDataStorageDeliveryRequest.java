// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataStorageDeliveryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aegis-log-login</p>
     */
    @NameInMap("LogCode")
    public String logCode;

    /**
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("LogDeliveryStatus")
    public String logDeliveryStatus;

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

    public static UpdateDataStorageDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataStorageDeliveryRequest self = new UpdateDataStorageDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataStorageDeliveryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDataStorageDeliveryRequest setLogCode(String logCode) {
        this.logCode = logCode;
        return this;
    }
    public String getLogCode() {
        return this.logCode;
    }

    public UpdateDataStorageDeliveryRequest setLogDeliveryStatus(String logDeliveryStatus) {
        this.logDeliveryStatus = logDeliveryStatus;
        return this;
    }
    public String getLogDeliveryStatus() {
        return this.logDeliveryStatus;
    }

    public UpdateDataStorageDeliveryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDataStorageDeliveryRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
