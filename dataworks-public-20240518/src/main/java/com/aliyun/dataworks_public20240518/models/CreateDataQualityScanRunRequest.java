// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityScanRunRequest extends TeaModel {
    /**
     * <p>The data quality scan ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20000001</p>
     */
    @NameInMap("DataQualityScanId")
    public Long dataQualityScanId;

    /**
     * <p>The parameters for the run. The <code>triggerTime</code> parameter is required.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<CreateDataQualityScanRunRequestParameters> parameters;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>Specifies the scheduling resource group used to run the data quality scan. This object uses the same data structure as the scheduling API.</p>
     */
    @NameInMap("RuntimeResource")
    public CreateDataQualityScanRunRequestRuntimeResource runtimeResource;

    public static CreateDataQualityScanRunRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityScanRunRequest self = new CreateDataQualityScanRunRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityScanRunRequest setDataQualityScanId(Long dataQualityScanId) {
        this.dataQualityScanId = dataQualityScanId;
        return this;
    }
    public Long getDataQualityScanId() {
        return this.dataQualityScanId;
    }

    public CreateDataQualityScanRunRequest setParameters(java.util.List<CreateDataQualityScanRunRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<CreateDataQualityScanRunRequestParameters> getParameters() {
        return this.parameters;
    }

    public CreateDataQualityScanRunRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDataQualityScanRunRequest setRuntimeResource(CreateDataQualityScanRunRequestRuntimeResource runtimeResource) {
        this.runtimeResource = runtimeResource;
        return this;
    }
    public CreateDataQualityScanRunRequestRuntimeResource getRuntimeResource() {
        return this.runtimeResource;
    }

    public static class CreateDataQualityScanRunRequestParameters extends TeaModel {
        /**
         * <p>The name of the parameter. The only supported value is:</p>
         * <ul>
         * <li>triggerTime</li>
         * </ul>
         * <p>No other scheduling parameters are currently supported.</p>
         * 
         * <strong>example:</strong>
         * <p>triggerTime</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter value.</p>
         * <ul>
         * <li>If the parameter name is triggerTime, this value must be the trigger time as a timestamp.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1775812636</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDataQualityScanRunRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityScanRunRequestParameters self = new CreateDataQualityScanRunRequestParameters();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityScanRunRequestParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDataQualityScanRunRequestParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateDataQualityScanRunRequestRuntimeResource extends TeaModel {
        /**
         * <p>The number of compute units (CUs) to reserve from the resource group for the data quality scan.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Cu")
        public Float cu;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e9455a13-ff00-4965-833c-337546ba4854</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The image configuration for running the data quality scan on the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxxxxx</p>
         */
        @NameInMap("Image")
        public String image;

        public static CreateDataQualityScanRunRequestRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityScanRunRequestRuntimeResource self = new CreateDataQualityScanRunRequestRuntimeResource();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityScanRunRequestRuntimeResource setCu(Float cu) {
            this.cu = cu;
            return this;
        }
        public Float getCu() {
            return this.cu;
        }

        public CreateDataQualityScanRunRequestRuntimeResource setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateDataQualityScanRunRequestRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

    }

}
