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
     * <p>The name can contain letters, digits, and hyphens (-).</p>
     * <p>For information about how to obtain the name of a namespace, see <a href="https://help.aliyun.com/document_detail/428880.html">DescribeHybridMonitorNamespaceList</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The data retention period. Valid values:</p>
     * <ul>
     * <li>cms.s1.large: Data is stored for 15 days.</li>
     * <li>cms.s1.xlarge: Data is stored for 32 days.</li>
     * <li>cms.s1.2xlarge: Data is stored for 63 days.</li>
     * <li>cms.s1.3xlarge: Data is stored for 93 days.</li>
     * <li>cms.s1.6xlarge: Data is stored for 185 days.</li>
     * <li>cms.s1.12xlarge: Data is stored for 376 days.</li>
     * </ul>
     * <p>For information about the pricing for different retention periods, see the <strong>Pricing</strong> section in <a href="https://help.aliyun.com/document_detail/223532.html">Billing of the dashboard feature</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cms.s1.2xlarge</p>
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
