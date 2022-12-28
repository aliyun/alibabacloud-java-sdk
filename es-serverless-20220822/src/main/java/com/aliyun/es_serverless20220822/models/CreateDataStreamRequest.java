// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20220822.models;

import com.aliyun.tea.*;

public class CreateDataStreamRequest extends TeaModel {
    // 代表资源名称的资源属性字段
    @NameInMap("dataStreamName")
    public String dataStreamName;

    // 删除时间
    @NameInMap("deletePhase")
    public String deletePhase;

    @NameInMap("dynamic")
    public String dynamic;

    @NameInMap("regionId")
    public String regionId;

    // 数据流模板
    @NameInMap("template")
    public CreateDataStreamRequestTemplate template;

    @NameInMap("timeStampKey")
    public String timeStampKey;

    // 数据流类型
    @NameInMap("type")
    public String type;

    public static CreateDataStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataStreamRequest self = new CreateDataStreamRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataStreamRequest setDataStreamName(String dataStreamName) {
        this.dataStreamName = dataStreamName;
        return this;
    }
    public String getDataStreamName() {
        return this.dataStreamName;
    }

    public CreateDataStreamRequest setDeletePhase(String deletePhase) {
        this.deletePhase = deletePhase;
        return this;
    }
    public String getDeletePhase() {
        return this.deletePhase;
    }

    public CreateDataStreamRequest setDynamic(String dynamic) {
        this.dynamic = dynamic;
        return this;
    }
    public String getDynamic() {
        return this.dynamic;
    }

    public CreateDataStreamRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDataStreamRequest setTemplate(CreateDataStreamRequestTemplate template) {
        this.template = template;
        return this;
    }
    public CreateDataStreamRequestTemplate getTemplate() {
        return this.template;
    }

    public CreateDataStreamRequest setTimeStampKey(String timeStampKey) {
        this.timeStampKey = timeStampKey;
        return this;
    }
    public String getTimeStampKey() {
        return this.timeStampKey;
    }

    public CreateDataStreamRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateDataStreamRequestTemplate extends TeaModel {
        // 索引字段设置
        @NameInMap("mappings")
        public java.util.List<DataStreamMapping> mappings;

        public static CreateDataStreamRequestTemplate build(java.util.Map<String, ?> map) throws Exception {
            CreateDataStreamRequestTemplate self = new CreateDataStreamRequestTemplate();
            return TeaModel.build(map, self);
        }

        public CreateDataStreamRequestTemplate setMappings(java.util.List<DataStreamMapping> mappings) {
            this.mappings = mappings;
            return this;
        }
        public java.util.List<DataStreamMapping> getMappings() {
            return this.mappings;
        }

    }

}
