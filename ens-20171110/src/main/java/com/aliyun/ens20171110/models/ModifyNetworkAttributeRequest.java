// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyNetworkAttributeRequest extends TeaModel {
    /**
     * <p>The description of the network.</p>
     * <p>The description must be 2 to 256 characters in length. It must start with a letter but cannot start with http\:// or https\://.</p>
     * 
     * <strong>example:</strong>
     * <p>this is my first network</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the network.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>n-****</p>
     */
    @NameInMap("NetworkId")
    public String networkId;

    /**
     * <p>The name of the network. The name must meet the following requirements:</p>
     * <ul>
     * <li><p>The name must be 2 to 128 characters in length</p>
     * </li>
     * <li><p>It must start with a letter but cannot start with http\:// or https\://.</p>
     * </li>
     * <li><p>The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("NetworkName")
    public String networkName;

    public static ModifyNetworkAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkAttributeRequest self = new ModifyNetworkAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyNetworkAttributeRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public ModifyNetworkAttributeRequest setNetworkName(String networkName) {
        this.networkName = networkName;
        return this;
    }
    public String getNetworkName() {
        return this.networkName;
    }

}
