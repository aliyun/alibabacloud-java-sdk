// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertOutputGroupOutput extends TeaModel {
    @NameInMap("Features")
    public String features;

    @NameInMap("Name")
    public String name;

    @NameInMap("OutputFileName")
    public String outputFileName;

    @NameInMap("OverrideParams")
    public String overrideParams;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("TemplateId")
    public String templateId;

    public static MediaConvertOutputGroupOutput build(java.util.Map<String, ?> map) throws Exception {
        MediaConvertOutputGroupOutput self = new MediaConvertOutputGroupOutput();
        return TeaModel.build(map, self);
    }

    public MediaConvertOutputGroupOutput setFeatures(String features) {
        this.features = features;
        return this;
    }
    public String getFeatures() {
        return this.features;
    }

    public MediaConvertOutputGroupOutput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MediaConvertOutputGroupOutput setOutputFileName(String outputFileName) {
        this.outputFileName = outputFileName;
        return this;
    }
    public String getOutputFileName() {
        return this.outputFileName;
    }

    public MediaConvertOutputGroupOutput setOverrideParams(String overrideParams) {
        this.overrideParams = overrideParams;
        return this;
    }
    public String getOverrideParams() {
        return this.overrideParams;
    }

    public MediaConvertOutputGroupOutput setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public MediaConvertOutputGroupOutput setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
