// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertOutputGroup extends TeaModel {
    @NameInMap("GroupConfig")
    public MediaConvertOutputGroupConfig groupConfig;

    @NameInMap("Name")
    public String name;

    @NameInMap("Outputs")
    public java.util.List<MediaConvertOutputGroupOutput> outputs;

    public static MediaConvertOutputGroup build(java.util.Map<String, ?> map) throws Exception {
        MediaConvertOutputGroup self = new MediaConvertOutputGroup();
        return TeaModel.build(map, self);
    }

    public MediaConvertOutputGroup setGroupConfig(MediaConvertOutputGroupConfig groupConfig) {
        this.groupConfig = groupConfig;
        return this;
    }
    public MediaConvertOutputGroupConfig getGroupConfig() {
        return this.groupConfig;
    }

    public MediaConvertOutputGroup setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MediaConvertOutputGroup setOutputs(java.util.List<MediaConvertOutputGroupOutput> outputs) {
        this.outputs = outputs;
        return this;
    }
    public java.util.List<MediaConvertOutputGroupOutput> getOutputs() {
        return this.outputs;
    }

}
