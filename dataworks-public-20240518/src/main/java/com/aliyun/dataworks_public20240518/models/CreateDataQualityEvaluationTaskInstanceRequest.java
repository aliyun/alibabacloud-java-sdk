// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityEvaluationTaskInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200001</p>
     */
    @NameInMap("DataQualityEvaluationTaskId")
    public Long dataQualityEvaluationTaskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;triggerTime&quot;: 1733284062000 }</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

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
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Cu")
        public Double cu;

        /**
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
