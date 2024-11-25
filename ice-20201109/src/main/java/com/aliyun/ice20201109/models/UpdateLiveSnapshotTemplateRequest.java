// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLiveSnapshotTemplateRequest extends TeaModel {
    /**
     * <p>The naming format of the snapshot captured in overwrite mode.</p>
     * <ul>
     * <li>The value cannot start with a forward slash (/). Only the suffix .jpg is supported.</li>
     * <li>The value cannot exceed 255 characters in length.</li>
     * <li>The {JobId} placeholder is supported. It specifies the ID of the snapshot job.</li>
     * <li>Placeholders such as {UnixTimestamp}, {Sequence}, and {Date} are not allowed.</li>
     * <li>You must specify at least one of the OverwriteFormat and SequenceFormat parameters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>snapshot/{JobId}.jpg</p>
     */
    @NameInMap("OverwriteFormat")
    public String overwriteFormat;

    /**
     * <p>The naming format of the snapshot captured in time series mode.</p>
     * <ul>
     * <li>The value cannot start with a forward slash (/). Only the suffix .jpg is supported.</li>
     * <li>The value cannot exceed 255 characters in length.</li>
     * <li>The {JobId}, {Date}, {UnixTimestamp}, and {Sequence} placeholders are supported. {JobId} specifies the ID of the snapshot job. {Date} specifies the date on which the snapshot is captured. {UnixTimestamp} specifies the timestamp of the snapshot. {Sequence} specifies the sequence number of the snapshot. You must specify at least one of the {UnixTimestamp} and {Sequence} placeholders.</li>
     * <li>You must specify at least one of the OverwriteFormat and SequenceFormat parameters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>snapshot/{JobId}/{UnixTimestamp}.jpg</p>
     */
    @NameInMap("SequenceFormat")
    public String sequenceFormat;

    /**
     * <p>The template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>a046-263c-3560-978a-fb287782</strong></strong></p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The name of the template.</p>
     * <ul>
     * <li>It cannot exceed 128 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The interval between two adjacent snapshots. Unit: seconds.</p>
     * <ul>
     * <li>Valid values: [5,3600].</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
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
