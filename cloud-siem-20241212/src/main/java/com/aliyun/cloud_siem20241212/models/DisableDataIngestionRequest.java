// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DisableDataIngestionRequest extends TeaModel {
    @NameInMap("DataIngestionId")
    public String dataIngestionId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleFor")
    public Long roleFor;

    public static DisableDataIngestionRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableDataIngestionRequest self = new DisableDataIngestionRequest();
        return TeaModel.build(map, self);
    }

    public DisableDataIngestionRequest setDataIngestionId(String dataIngestionId) {
        this.dataIngestionId = dataIngestionId;
        return this;
    }
    public String getDataIngestionId() {
        return this.dataIngestionId;
    }

    public DisableDataIngestionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DisableDataIngestionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DisableDataIngestionRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
