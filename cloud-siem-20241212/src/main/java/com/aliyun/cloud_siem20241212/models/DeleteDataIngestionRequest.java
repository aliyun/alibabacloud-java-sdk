// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteDataIngestionRequest extends TeaModel {
    @NameInMap("DataIngestionId")
    public String dataIngestionId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleFor")
    public Long roleFor;

    public static DeleteDataIngestionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataIngestionRequest self = new DeleteDataIngestionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataIngestionRequest setDataIngestionId(String dataIngestionId) {
        this.dataIngestionId = dataIngestionId;
        return this;
    }
    public String getDataIngestionId() {
        return this.dataIngestionId;
    }

    public DeleteDataIngestionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteDataIngestionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteDataIngestionRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
