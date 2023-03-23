// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class CreateAIJobRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("AreaThreshold")
    public Double areaThreshold;

    @NameInMap("Confidence")
    public Double confidence;

    @NameInMap("Inputs")
    public java.util.List<CreateAIJobRequestInputs> inputs;

    @NameInMap("JobName")
    public String jobName;

    @NameInMap("ModelProjectId")
    public Long modelProjectId;

    @NameInMap("ModelVersion")
    public String modelVersion;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ShapeDataId")
    public String shapeDataId;

    @NameInMap("ShapeWkt")
    public String shapeWkt;

    public static CreateAIJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAIJobRequest self = new CreateAIJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateAIJobRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public CreateAIJobRequest setAreaThreshold(Double areaThreshold) {
        this.areaThreshold = areaThreshold;
        return this;
    }
    public Double getAreaThreshold() {
        return this.areaThreshold;
    }

    public CreateAIJobRequest setConfidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }
    public Double getConfidence() {
        return this.confidence;
    }

    public CreateAIJobRequest setInputs(java.util.List<CreateAIJobRequestInputs> inputs) {
        this.inputs = inputs;
        return this;
    }
    public java.util.List<CreateAIJobRequestInputs> getInputs() {
        return this.inputs;
    }

    public CreateAIJobRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public CreateAIJobRequest setModelProjectId(Long modelProjectId) {
        this.modelProjectId = modelProjectId;
        return this;
    }
    public Long getModelProjectId() {
        return this.modelProjectId;
    }

    public CreateAIJobRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public CreateAIJobRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateAIJobRequest setShapeDataId(String shapeDataId) {
        this.shapeDataId = shapeDataId;
        return this;
    }
    public String getShapeDataId() {
        return this.shapeDataId;
    }

    public CreateAIJobRequest setShapeWkt(String shapeWkt) {
        this.shapeWkt = shapeWkt;
        return this;
    }
    public String getShapeWkt() {
        return this.shapeWkt;
    }

    public static class CreateAIJobRequestInputsDes extends TeaModel {
        @NameInMap("BandNo")
        public String bandNo;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Type")
        public String type;

        @NameInMap("ZoomLevel")
        public Integer zoomLevel;

        public static CreateAIJobRequestInputsDes build(java.util.Map<String, ?> map) throws Exception {
            CreateAIJobRequestInputsDes self = new CreateAIJobRequestInputsDes();
            return TeaModel.build(map, self);
        }

        public CreateAIJobRequestInputsDes setBandNo(String bandNo) {
            this.bandNo = bandNo;
            return this;
        }
        public String getBandNo() {
            return this.bandNo;
        }

        public CreateAIJobRequestInputsDes setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public CreateAIJobRequestInputsDes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateAIJobRequestInputsDes setZoomLevel(Integer zoomLevel) {
            this.zoomLevel = zoomLevel;
            return this;
        }
        public Integer getZoomLevel() {
            return this.zoomLevel;
        }

    }

    public static class CreateAIJobRequestInputsSrc extends TeaModel {
        @NameInMap("BandNo")
        public String bandNo;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Type")
        public String type;

        @NameInMap("ZoomLevel")
        public Integer zoomLevel;

        public static CreateAIJobRequestInputsSrc build(java.util.Map<String, ?> map) throws Exception {
            CreateAIJobRequestInputsSrc self = new CreateAIJobRequestInputsSrc();
            return TeaModel.build(map, self);
        }

        public CreateAIJobRequestInputsSrc setBandNo(String bandNo) {
            this.bandNo = bandNo;
            return this;
        }
        public String getBandNo() {
            return this.bandNo;
        }

        public CreateAIJobRequestInputsSrc setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public CreateAIJobRequestInputsSrc setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateAIJobRequestInputsSrc setZoomLevel(Integer zoomLevel) {
            this.zoomLevel = zoomLevel;
            return this;
        }
        public Integer getZoomLevel() {
            return this.zoomLevel;
        }

    }

    public static class CreateAIJobRequestInputs extends TeaModel {
        @NameInMap("Des")
        public CreateAIJobRequestInputsDes des;

        @NameInMap("Idx")
        public Integer idx;

        @NameInMap("Src")
        public CreateAIJobRequestInputsSrc src;

        public static CreateAIJobRequestInputs build(java.util.Map<String, ?> map) throws Exception {
            CreateAIJobRequestInputs self = new CreateAIJobRequestInputs();
            return TeaModel.build(map, self);
        }

        public CreateAIJobRequestInputs setDes(CreateAIJobRequestInputsDes des) {
            this.des = des;
            return this;
        }
        public CreateAIJobRequestInputsDes getDes() {
            return this.des;
        }

        public CreateAIJobRequestInputs setIdx(Integer idx) {
            this.idx = idx;
            return this;
        }
        public Integer getIdx() {
            return this.idx;
        }

        public CreateAIJobRequestInputs setSrc(CreateAIJobRequestInputsSrc src) {
            this.src = src;
            return this;
        }
        public CreateAIJobRequestInputsSrc getSrc() {
            return this.src;
        }

    }

}
