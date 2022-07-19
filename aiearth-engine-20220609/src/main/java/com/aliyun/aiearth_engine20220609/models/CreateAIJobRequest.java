// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class CreateAIJobRequest extends TeaModel {
    // 算法名称，对应枚举：building_extraction, "建筑物提取"
    // greenhouse_extraction, "大棚提取"
    // land_cover_classification, "地物分类"
    // pv_plant, "光伏电厂识别"
    // barrage, "拦河坝识别"
    // construction_change, "通用变化检测"
    // multiclass, "变化多分类"
    // farmland_extraction_remote_sensing, "地块提取"
    // sar_water, "sar水体提取"
    // building_change, "建筑物变化检测"
    // farmland_change, "农田变化检测"
    // remove_cloud_haze, "去云雾处理"
    @NameInMap("App")
    public String app;

    // 过滤阈值，选择图斑过滤面积，小于此面积不提取
    @NameInMap("AreaThreshold")
    public Double areaThreshold;

    // 置信度，选择识别目标的置信度，0-100
    @NameInMap("Confidence")
    public Double confidence;

    // 待分析数据列表
    @NameInMap("Inputs")
    public java.util.List<CreateAIJobRequestInputs> inputs;

    // 任务名称
    @NameInMap("JobName")
    public String jobName;

    // 项目Id
    @NameInMap("ProjectId")
    public Long projectId;

    // 区域选择，对应区域shapeId
    @NameInMap("ShapeDataId")
    public String shapeDataId;

    // 区域选择，wkt格式
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
        // 数据的DataId
        @NameInMap("DataId")
        public String dataId;

        public static CreateAIJobRequestInputsDes build(java.util.Map<String, ?> map) throws Exception {
            CreateAIJobRequestInputsDes self = new CreateAIJobRequestInputsDes();
            return TeaModel.build(map, self);
        }

        public CreateAIJobRequestInputsDes setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

    }

    public static class CreateAIJobRequestInputsSrc extends TeaModel {
        // 数据的DataId
        @NameInMap("DataId")
        public String dataId;

        public static CreateAIJobRequestInputsSrc build(java.util.Map<String, ?> map) throws Exception {
            CreateAIJobRequestInputsSrc self = new CreateAIJobRequestInputsSrc();
            return TeaModel.build(map, self);
        }

        public CreateAIJobRequestInputsSrc setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

    }

    public static class CreateAIJobRequestInputs extends TeaModel {
        @NameInMap("Des")
        public CreateAIJobRequestInputsDes des;

        // 输入序号
        @NameInMap("Idx")
        public Integer idx;

        // 第一张图片
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
