// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityScanRunShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the data quality monitor.</p>
     * 
     * <strong>example:</strong>
     * <p>20000001</p>
     */
    @NameInMap("DataQualityScanId")
    public Long dataQualityScanId;

    /**
     * <p>The parameter settings used during the actual run. The <code>triggerTime</code> parameter is required.</p>
     */
    @NameInMap("Parameters")
    public String parametersShrink;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The scheduling resource group used when running the data quality monitor. This resource group uses the same data structure as in the scheduling API.</p>
     */
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
