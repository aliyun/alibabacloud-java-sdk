// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyHybridMonitorNamespaceRequest extends TeaModel {
    /**
     * <p>The description of the namespace.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the namespace.</p>
     * <br>
     * <p>The name can contain letters, digits, and hyphens (-).</p>
     * <br>
     * <p>For information about how to obtain the name of a namespace, see [DescribeHybridMonitorNamespaceList](~~428880~~).</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The data retention period. Valid values:</p>
     * <br>
     * <p>*   cms.s1.large: Data is stored for 15 days.</p>
     * <p>*   cms.s1.xlarge: Data is stored for 32 days.</p>
     * <p>*   cms.s1.2xlarge: Data is stored for 63 days.</p>
     * <p>*   cms.s1.3xlarge: Data is stored for 93 days.</p>
     * <p>*   cms.s1.6xlarge: Data is stored for 185 days.</p>
     * <p>*   cms.s1.12xlarge: Data is stored for 376 days.</p>
     * <br>
     * <p>For information about the pricing for different retention periods, see the **Pricing** section in [Billing of the dashboard feature](~~223532~~).</p>
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
