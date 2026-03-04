// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertOutputGroupOutput extends TeaModel {
    /**
     * <p>The feature parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Features")
    public String features;

    /**
     * <p>A name to label this output. This is for identification purposes only and does not affect the filename.</p>
     * 
     * <strong>example:</strong>
     * <p>group-output</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The filename for this output. This path is relative to OutputFileBase defined in MediaConvertOutputGroupConfig. The final output path is {OutputFileBase}/{OutputFileName}.</p>
     * 
     * <strong>example:</strong>
     * <p>720p.mp4</p>
     */
    @NameInMap("OutputFileName")
    public String outputFileName;

    /**
     * <p>A JSON string containing parameters to override the settings from the associated transcoding template.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("OverrideParams")
    public String overrideParams;

    /**
     * <p>The processing priority for this output. Valid values: 1 to 10. A higher value indicates higher priority. Default value: 6.</p>
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
