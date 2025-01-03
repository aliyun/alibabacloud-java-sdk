// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateAccessGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-online-cluster-policy</p>
     */
    @NameInMap("AccessGroupName")
    public String accessGroupName;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("InputRegionId")
    public String inputRegionId;

    /**
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
