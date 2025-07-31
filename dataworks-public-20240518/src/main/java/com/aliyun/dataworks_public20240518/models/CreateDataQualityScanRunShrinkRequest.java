// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityScanRunShrinkRequest extends TeaModel {
    @NameInMap("DataQualityScanId")
    public Long dataQualityScanId;

    @NameInMap("Parameters")
    public String parametersShrink;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("RuntimeResource")
    public String runtimeResourceShrink;

    public static CreateDataQualityScanRunShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityScanRunShrinkRequest self = new CreateDataQualityScanRunShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityScanRunShrinkRequest setDataQualityScanId(Long dataQualityScanId) {
        this.dataQualityScanId = dataQualityScanId;
        return this;
    }
    public Long getDataQualityScanId() {
        return this.dataQualityScanId;
    }

    public CreateDataQualityScanRunShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public CreateDataQualityScanRunShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDataQualityScanRunShrinkRequest setRuntimeResourceShrink(String runtimeResourceShrink) {
        this.runtimeResourceShrink = runtimeResourceShrink;
        return this;
    }
    public String getRuntimeResourceShrink() {
        return this.runtimeResourceShrink;
    }

}
