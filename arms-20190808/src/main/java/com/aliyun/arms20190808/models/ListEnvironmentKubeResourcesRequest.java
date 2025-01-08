// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvironmentKubeResourcesRequest extends TeaModel {
    /**
     * <p>The environment ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>env-xxx</p>
     */
    @NameInMap("EnvironmentId")
    public String environmentId;

    /**
     * <p>The resource type. Valid values: Pod, Deployment, and Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Pod</p>
     */
    @NameInMap("Kind")
    public String kind;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("LabelSelectors")
    public java.util.Map<String, String> labelSelectors;

    /**
     * <p>The namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListEnvironmentKubeResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentKubeResourcesRequest self = new ListEnvironmentKubeResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentKubeResourcesRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public ListEnvironmentKubeResourcesRequest setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public ListEnvironmentKubeResourcesRequest setLabelSelectors(java.util.Map<String, String> labelSelectors) {
        this.labelSelectors = labelSelectors;
        return this;
    }
    public java.util.Map<String, String> getLabelSelectors() {
        return this.labelSelectors;
    }

    public ListEnvironmentKubeResourcesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListEnvironmentKubeResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
