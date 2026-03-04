// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertOutput extends TeaModel {
    /**
     * <p>The feature parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Features")
    public String features;

    /**
     * <p>The name of the output.</p>
     * 
     * <strong>example:</strong>
     * <p>output-video</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The output file.</p>
     */
    @NameInMap("OutputFile")
    public MediaObject outputFile;

    /**
     * <p>A JSON string containing parameters to overwrite the corresponding settings of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("OverrideParams")
    public String overrideParams;

    /**
     * <p>The priority. Valid values: 1 to 10. A larger value indicates a higher priority. Default value: 6.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The ID of the transcoding template.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
     */
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
