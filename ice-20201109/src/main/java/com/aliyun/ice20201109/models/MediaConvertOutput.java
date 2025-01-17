// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertOutput extends TeaModel {
    @NameInMap("Features")
    public String features;

    @NameInMap("Name")
    public String name;

    @NameInMap("OutputFile")
    public MediaObject outputFile;

    @NameInMap("OverrideParams")
    public String overrideParams;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("TemplateId")
    public String templateId;

    public static MediaConvertOutput build(java.util.Map<String, ?> map) throws Exception {
        MediaConvertOutput self = new MediaConvertOutput();
        return TeaModel.build(map, self);
    }

    public MediaConvertOutput setFeatures(String features) {
        this.features = features;
        return this;
    }
    public String getFeatures() {
        return this.features;
    }

    public MediaConvertOutput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MediaConvertOutput setOutputFile(MediaObject outputFile) {
        this.outputFile = outputFile;
        return this;
    }
    public MediaObject getOutputFile() {
        return this.outputFile;
    }

    public MediaConvertOutput setOverrideParams(String overrideParams) {
        this.overrideParams = overrideParams;
        return this;
    }
    public String getOverrideParams() {
        return this.overrideParams;
    }

    public MediaConvertOutput setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public MediaConvertOutput setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
