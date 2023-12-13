// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateHybridMonitorNamespaceRequest extends TeaModel {
    /**
     * <p>The description of the namespace.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the namespace.</p>
     * <br>
     * <p>The name can contain lowercase letters, digits, and hyphens (-).</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("NamespaceRegion")
    public String namespaceRegion;

    @NameInMap("NamespaceType")
    public String namespaceType;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The data retention period of the namespace. Valid values:</p>
     * <br>
     * <p>*   cms.s1.large: 15 days</p>
     * <p>*   cms.s1.xlarge: 32 days</p>
     * <p>*   cms.s1.2xlarge: 63 days</p>
     * <p>*   cms.s1.3xlarge (default value): 93 days</p>
     * <p>*   cms.s1.6xlarge: 185 days</p>
     * <p>*   cms.s1.12xlarge: 376 days</p>
     * <br>
     * <p>For information about the pricing for different retention periods, see the **Pricing** section in [Billing of the dashboard feature](~~223532~~).</p>
     */
    @NameInMap("Spec")
    public String spec;

    public static CreateHybridMonitorNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHybridMonitorNamespaceRequest self = new CreateHybridMonitorNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateHybridMonitorNamespaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateHybridMonitorNamespaceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateHybridMonitorNamespaceRequest setNamespaceRegion(String namespaceRegion) {
        this.namespaceRegion = namespaceRegion;
        return this;
    }
    public String getNamespaceRegion() {
        return this.namespaceRegion;
    }

    public CreateHybridMonitorNamespaceRequest setNamespaceType(String namespaceType) {
        this.namespaceType = namespaceType;
        return this;
    }
    public String getNamespaceType() {
        return this.namespaceType;
    }

    public CreateHybridMonitorNamespaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateHybridMonitorNamespaceRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
