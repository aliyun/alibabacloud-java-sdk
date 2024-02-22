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

    /**
     * <p>The region where the metric data is stored.</p>
     */
    @NameInMap("NamespaceRegion")
    public String namespaceRegion;

    /**
     * <p>The storage scheme of metric data. Valid values:</p>
     * <br>
     * <p>*   m_prom_pool: The metric data is stored in Simple Log Service.</p>
     * <p>*   m_prometheus: The metric data is stored in the storage space provided by CloudMonitor.</p>
     * <br>
     * <p>>  For more information about the storage schemes of metric data, see [Storage schemes of metric data in Hybrid Cloud Monitoring](~~2594921~~).</p>
     */
    @NameInMap("NamespaceType")
    public String namespaceType;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The data retention period. Valid values:</p>
     * <br>
     * <p>*   cms.s1.large (Retention Period 15 Days)</p>
     * <p>*   cms.s1.xlarge (Retention Period 32 Days)</p>
     * <p>*   cms.s1.2xlarge (Retention Period 63 Days)</p>
     * <p>*   cms.s1.3xlarge (Retention Period 93 Days) (default)</p>
     * <p>*   cms.s1.6xlarge (Retention Period 185 Days)</p>
     * <p>*   cms.s1.12xlarge (Retention Period 367 Days)</p>
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
