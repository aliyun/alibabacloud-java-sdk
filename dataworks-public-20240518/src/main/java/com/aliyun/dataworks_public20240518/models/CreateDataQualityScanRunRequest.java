// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityScanRunRequest extends TeaModel {
    @NameInMap("DataQualityScanId")
    public Long dataQualityScanId;

    @NameInMap("Parameters")
    public java.util.List<CreateDataQualityScanRunRequestParameters> parameters;

    @NameInMap("ProjectId")
    public Long projectId;

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
         * <strong>example:</strong>
         * <p>regiondt</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai$[yyyy-mm-dd-1]</p>
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
        @NameInMap("Cu")
        public Float cu;

        @NameInMap("Id")
        public String id;

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
