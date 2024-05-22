// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLiveSnapshotTemplateRequest extends TeaModel {
    @NameInMap("OverwriteFormat")
    public String overwriteFormat;

    @NameInMap("SequenceFormat")
    public String sequenceFormat;

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

    public static CreateLiveSnapshotTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveSnapshotTemplateRequest self = new CreateLiveSnapshotTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateLiveSnapshotTemplateRequest setOverwriteFormat(String overwriteFormat) {
        this.overwriteFormat = overwriteFormat;
        return this;
    }
    public String getOverwriteFormat() {
        return this.overwriteFormat;
    }

    public CreateLiveSnapshotTemplateRequest setSequenceFormat(String sequenceFormat) {
        this.sequenceFormat = sequenceFormat;
        return this;
    }
    public String getSequenceFormat() {
        return this.sequenceFormat;
    }

    public CreateLiveSnapshotTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateLiveSnapshotTemplateRequest setTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }
    public Integer getTimeInterval() {
        return this.timeInterval;
    }

}
