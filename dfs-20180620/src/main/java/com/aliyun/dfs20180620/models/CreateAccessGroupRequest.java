// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateAccessGroupRequest extends TeaModel {
    /**
     * <p>The name of the access group. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be 6 to 64 characters in length.</li>
     * <li>The name must be globally unique and cannot be an empty string.</li>
     * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-online-cluster-policy</p>
     */
    @NameInMap("AccessGroupName")
    public String accessGroupName;

    /**
     * <p>The description of the access group. The description can be up to 32 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Dedicated policy for production cluster CIDR blocks</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("InputRegionId")
    public String inputRegionId;

    /**
     * <p>The type of the access group. Only VPC is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    public static CreateAccessGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessGroupRequest self = new CreateAccessGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccessGroupRequest setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }
    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    public CreateAccessGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAccessGroupRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public CreateAccessGroupRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

}
