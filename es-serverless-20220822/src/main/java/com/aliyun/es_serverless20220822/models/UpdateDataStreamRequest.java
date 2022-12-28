// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20220822.models;

import com.aliyun.tea.*;

public class UpdateDataStreamRequest extends TeaModel {
    // 删除时间
    @NameInMap("deletePhase")
    public String deletePhase;

    @NameInMap("dynamic")
    public String dynamic;

    @NameInMap("template")
    public UpdateDataStreamRequestTemplate template;

    @NameInMap("timeStampKey")
    public String timeStampKey;

    public static UpdateDataStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataStreamRequest self = new UpdateDataStreamRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataStreamRequest setDeletePhase(String deletePhase) {
        this.deletePhase = deletePhase;
        return this;
    }
    public String getDeletePhase() {
        return this.deletePhase;
    }

    public UpdateDataStreamRequest setDynamic(String dynamic) {
        this.dynamic = dynamic;
        return this;
    }
    public String getDynamic() {
        return this.dynamic;
    }

    public UpdateDataStreamRequest setTemplate(UpdateDataStreamRequestTemplate template) {
        this.template = template;
        return this;
    }
    public UpdateDataStreamRequestTemplate getTemplate() {
        return this.template;
    }

    public UpdateDataStreamRequest setTimeStampKey(String timeStampKey) {
        this.timeStampKey = timeStampKey;
        return this;
    }
    public String getTimeStampKey() {
        return this.timeStampKey;
    }

    public static class UpdateDataStreamRequestTemplate extends TeaModel {
        @NameInMap("mappings")
        public java.util.List<DataStreamMapping> mappings;

        public static UpdateDataStreamRequestTemplate build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataStreamRequestTemplate self = new UpdateDataStreamRequestTemplate();
            return TeaModel.build(map, self);
        }

        public UpdateDataStreamRequestTemplate setMappings(java.util.List<DataStreamMapping> mappings) {
            this.mappings = mappings;
            return this;
        }
        public java.util.List<DataStreamMapping> getMappings() {
            return this.mappings;
        }

    }

}
