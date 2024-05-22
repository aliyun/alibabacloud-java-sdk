// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLiveSnapshotTemplateRequest extends TeaModel {
    @NameInMap("OverwriteFormat")
    public String overwriteFormat;

    @NameInMap("SequenceFormat")
    public String sequenceFormat;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TimeInterval")
    public Integer timeInterval;

    public static UpdateLiveSnapshotTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveSnapshotTemplateRequest self = new UpdateLiveSnapshotTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveSnapshotTemplateRequest setOverwriteFormat(String overwriteFormat) {
        this.overwriteFormat = overwriteFormat;
        return this;
    }
    public String getOverwriteFormat() {
        return this.overwriteFormat;
    }

    public UpdateLiveSnapshotTemplateRequest setSequenceFormat(String sequenceFormat) {
        this.sequenceFormat = sequenceFormat;
        return this;
    }
    public String getSequenceFormat() {
        return this.sequenceFormat;
    }

    public UpdateLiveSnapshotTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateLiveSnapshotTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public UpdateLiveSnapshotTemplateRequest setTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }
    public Integer getTimeInterval() {
        return this.timeInterval;
    }

}
