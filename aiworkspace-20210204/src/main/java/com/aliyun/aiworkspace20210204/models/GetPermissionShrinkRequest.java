// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetPermissionShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <strong>example:</strong>
     * <p>17915******4216</p>
     */
    @NameInMap("Creator")
    public String creator;

    @NameInMap("Labels")
    public String labelsShrink;

    @NameInMap("Option")
    public String option;

    @NameInMap("Resource")
    public String resource;

    public static GetPermissionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPermissionShrinkRequest self = new GetPermissionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetPermissionShrinkRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public GetPermissionShrinkRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GetPermissionShrinkRequest setLabelsShrink(String labelsShrink) {
        this.labelsShrink = labelsShrink;
        return this;
    }
    public String getLabelsShrink() {
        return this.labelsShrink;
    }

    public GetPermissionShrinkRequest setOption(String option) {
        this.option = option;
        return this;
    }
    public String getOption() {
        return this.option;
    }

    public GetPermissionShrinkRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

}
