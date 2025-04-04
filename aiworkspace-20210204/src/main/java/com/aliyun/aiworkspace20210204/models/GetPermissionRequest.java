// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetPermissionRequest extends TeaModel {
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
    public java.util.Map<String, ?> labels;

    @NameInMap("Option")
    public String option;

    @NameInMap("Resource")
    public String resource;

    public static GetPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPermissionRequest self = new GetPermissionRequest();
        return TeaModel.build(map, self);
    }

    public GetPermissionRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public GetPermissionRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GetPermissionRequest setLabels(java.util.Map<String, ?> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, ?> getLabels() {
        return this.labels;
    }

    public GetPermissionRequest setOption(String option) {
        this.option = option;
        return this;
    }
    public String getOption() {
        return this.option;
    }

    public GetPermissionRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

}
