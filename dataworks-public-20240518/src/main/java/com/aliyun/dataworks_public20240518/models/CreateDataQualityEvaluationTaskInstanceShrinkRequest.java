// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityEvaluationTaskInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the data quality evaluation task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2000011</p>
     */
    @NameInMap("DataQualityEvaluationTaskId")
    public Long dataQualityEvaluationTaskId;

    /**
     * <p>The execution parameters of the data quality evaluation in the JSON format. The following keys are available:</p>
     * <ul>
     * <li>triggerTime: the millisecond timestamp of the trigger time. This is the base time for the $[yyyymmdd] expression in the data range of data quality monitoring. This key is required.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;triggerTime&quot;: 1733284062000 }</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Management page to obtain the ID.</p>
     * <p>This parameter specifies the DataWorks workspace in which this API operation is performed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The resource group information. This parameter is required when you run a data quality evaluation on a non-MaxCompute data source.</p>
     */
    @NameInMap("RuntimeResource")
    public String runtimeResourceShrink;

    public static CreateDataQualityEvaluationTaskInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityEvaluationTaskInstanceShrinkRequest self = new CreateDataQualityEvaluationTaskInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityEvaluationTaskInstanceShrinkRequest setDataQualityEvaluationTaskId(Long dataQualityEvaluationTaskId) {
        this.dataQualityEvaluationTaskId = dataQualityEvaluationTaskId;
        return this;
    }
    public Long getDataQualityEvaluationTaskId() {
        return this.dataQualityEvaluationTaskId;
    }

    public CreateDataQualityEvaluationTaskInstanceShrinkRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public CreateDataQualityEvaluationTaskInstanceShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDataQualityEvaluationTaskInstanceShrinkRequest setRuntimeResourceShrink(String runtimeResourceShrink) {
        this.runtimeResourceShrink = runtimeResourceShrink;
        return this;
    }
    public String getRuntimeResourceShrink() {
        return this.runtimeResourceShrink;
    }

}
