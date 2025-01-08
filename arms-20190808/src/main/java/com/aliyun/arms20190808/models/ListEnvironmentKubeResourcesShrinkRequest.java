// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvironmentKubeResourcesShrinkRequest extends TeaModel {
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
    public String labelSelectorsShrink;

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

    public static ListEnvironmentKubeResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentKubeResourcesShrinkRequest self = new ListEnvironmentKubeResourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentKubeResourcesShrinkRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public ListEnvironmentKubeResourcesShrinkRequest setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public ListEnvironmentKubeResourcesShrinkRequest setLabelSelectorsShrink(String labelSelectorsShrink) {
        this.labelSelectorsShrink = labelSelectorsShrink;
        return this;
    }
    public String getLabelSelectorsShrink() {
        return this.labelSelectorsShrink;
    }

    public ListEnvironmentKubeResourcesShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListEnvironmentKubeResourcesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
