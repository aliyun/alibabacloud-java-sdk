// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ModifyDedicatedBlockStorageClusterAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests.</p>
     * <br>
     * <p>The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How do I ensure idempotence ](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the dedicated block storage cluster.</p>
     */
    @NameInMap("DbscId")
    public String dbscId;

    /**
     * <p>The new name of the dedicated block storage cluster.</p>
     */
    @NameInMap("DbscName")
    public String dbscName;

    /**
     * <p>The new description of dedicated block storage cluster.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The region ID of the dedicated block storage cluster. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
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
