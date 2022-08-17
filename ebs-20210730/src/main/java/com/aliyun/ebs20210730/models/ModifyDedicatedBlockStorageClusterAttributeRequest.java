// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ModifyDedicatedBlockStorageClusterAttributeRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DbscId")
    public String dbscId;

    @NameInMap("DbscName")
    public String dbscName;

    @NameInMap("Description")
    public String description;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDedicatedBlockStorageClusterAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedBlockStorageClusterAttributeRequest self = new ModifyDedicatedBlockStorageClusterAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedBlockStorageClusterAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDedicatedBlockStorageClusterAttributeRequest setDbscId(String dbscId) {
        this.dbscId = dbscId;
        return this;
    }
    public String getDbscId() {
        return this.dbscId;
    }

    public ModifyDedicatedBlockStorageClusterAttributeRequest setDbscName(String dbscName) {
        this.dbscName = dbscName;
        return this;
    }
    public String getDbscName() {
        return this.dbscName;
    }

    public ModifyDedicatedBlockStorageClusterAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyDedicatedBlockStorageClusterAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
