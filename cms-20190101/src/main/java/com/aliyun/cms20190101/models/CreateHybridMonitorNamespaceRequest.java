// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateHybridMonitorNamespaceRequest extends TeaModel {
    /**
     * <p>The description of the metric namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba Cloud product metric repository.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the metric namespace.</p>
     * <p>Format: The name can contain only lowercase letters, digits, and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The region where the monitoring data is stored.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("NamespaceRegion")
    public String namespaceRegion;

    /**
     * <p>The storage solution for monitoring data. Valid values:</p>
     * <ul>
     * <li>aliyun_prometheus: Stores monitoring data in Prometheus.</li>
     * </ul>
     * <blockquote>
     * <p>For more information about storage solutions for monitoring data, see <a href="https://help.aliyun.com/document_detail/2594921.html">Storage solutions for monitoring data in Hybrid Cloud Monitoring</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>aliyun_prometheus</p>
     */
    @NameInMap("NamespaceType")
    public String namespaceType;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The data storage duration. Valid values:</p>
     * <ul>
     * <li>cms.s1.large: Stores data for 15 days.</li>
     * <li>cms.s1.xlarge: Stores data for 32 days.</li>
     * <li>cms.s1.2xlarge: Stores data for 63 days.</li>
     * <li>cms.s1.3xlarge (default): Stores data for 93 days.</li>
     * <li>cms.s1.6xlarge: Stores data for 185 days.</li>
     * <li>cms.s1.12xlarge: Stores data for 376 days.</li>
     * </ul>
     * <p>For more information about the pricing of different storage durations, see the <strong>Pricing</strong> table in <a href="https://help.aliyun.com/document_detail/223532.html">Dashboard</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cms.s1.3xlarge</p>
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
