// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class CreateReservedNodePoolRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The number of reserved nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The description of the reserved node pool.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The suffix of the hostnames for the reserved nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>ed</p>
     */
    @NameInMap("HostPostfix")
    public String hostPostfix;

    /**
     * <p>The prefix of the hostnames for the reserved nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud</p>
     */
    @NameInMap("HostPrefix")
    public String hostPrefix;

    /**
     * <p>The name of the reserved node pool.</p>
     * 
     * <strong>example:</strong>
     * <p>nodepool</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1lfcjbfb099rrjn****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateReservedNodePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReservedNodePoolRequest self = new CreateReservedNodePoolRequest();
        return TeaModel.build(map, self);
    }

    public CreateReservedNodePoolRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateReservedNodePoolRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public CreateReservedNodePoolRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateReservedNodePoolRequest setHostPostfix(String hostPostfix) {
        this.hostPostfix = hostPostfix;
        return this;
    }
    public String getHostPostfix() {
        return this.hostPostfix;
    }

    public CreateReservedNodePoolRequest setHostPrefix(String hostPrefix) {
        this.hostPrefix = hostPrefix;
        return this;
    }
    public String getHostPrefix() {
        return this.hostPrefix;
    }

    public CreateReservedNodePoolRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateReservedNodePoolRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
