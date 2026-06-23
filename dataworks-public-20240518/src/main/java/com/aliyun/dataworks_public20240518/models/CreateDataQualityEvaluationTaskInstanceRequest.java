// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityEvaluationTaskInstanceRequest extends TeaModel {
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
    public CreateDataQualityEvaluationTaskInstanceRequestRuntimeResource runtimeResource;

    public static CreateDataQualityEvaluationTaskInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityEvaluationTaskInstanceRequest self = new CreateDataQualityEvaluationTaskInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityEvaluationTaskInstanceRequest setDataQualityEvaluationTaskId(Long dataQualityEvaluationTaskId) {
        this.dataQualityEvaluationTaskId = dataQualityEvaluationTaskId;
        return this;
    }
    public Long getDataQualityEvaluationTaskId() {
        return this.dataQualityEvaluationTaskId;
    }

    public CreateDataQualityEvaluationTaskInstanceRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public CreateDataQualityEvaluationTaskInstanceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDataQualityEvaluationTaskInstanceRequest setRuntimeResource(CreateDataQualityEvaluationTaskInstanceRequestRuntimeResource runtimeResource) {
        this.runtimeResource = runtimeResource;
        return this;
    }
    public CreateDataQualityEvaluationTaskInstanceRequestRuntimeResource getRuntimeResource() {
        return this.runtimeResource;
    }

    public static class CreateDataQualityEvaluationTaskInstanceRequestRuntimeResource extends TeaModel {
        /**
         * <p>The CU consumption configured for the task to run. This parameter must be specified if a serverless resource group is used.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Cu")
        public Double cu;

        /**
         * <p>The identifier of the scheduling resource group configured for the task to run.</p>
         * 
         * <strong>example:</strong>
         * <p>63900680</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static CreateDataQualityEvaluationTaskInstanceRequestRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityEvaluationTaskInstanceRequestRuntimeResource self = new CreateDataQualityEvaluationTaskInstanceRequestRuntimeResource();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityEvaluationTaskInstanceRequestRuntimeResource setCu(Double cu) {
            this.cu = cu;
            return this;
        }
        public Double getCu() {
            return this.cu;
        }

        public CreateDataQualityEvaluationTaskInstanceRequestRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

}
