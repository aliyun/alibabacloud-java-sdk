// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyHybridMonitorNamespaceRequest extends TeaModel {
    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The data retention period of the namespace. Valid values:</p>
     * <br>
     * <p>*   cms.s1.large: 15 days</p>
     * <p>*   cms.s1.xlarge: 32 days</p>
     * <p>*   cms.s1.2xlarge: 63 days</p>
     * <p>*   cms.s1.3xlarge: 93 days</p>
     * <p>*   cms.s1.6xlarge: 185 days</p>
     * <p>*   cms.s1.12xlarge: 376 days</p>
     * <br>
     * <p>For information about the pricing for different retention periods, see the **Pricing** section in [Billing of the dashboard feature](~~223532~~).</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Spec")
    public String spec;

    public static ModifyHybridMonitorNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridMonitorNamespaceRequest self = new ModifyHybridMonitorNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHybridMonitorNamespaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyHybridMonitorNamespaceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ModifyHybridMonitorNamespaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyHybridMonitorNamespaceRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
