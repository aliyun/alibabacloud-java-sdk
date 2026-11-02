// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLiveSnapshotTemplateRequest extends TeaModel {
    /**
     * <p>The file format for overwrite snapshots.</p>
     * <ul>
     * <li>It cannot start with a forward slash (/) and currently supports only the .jpg extension.</li>
     * <li>The maximum length is 255 characters.</li>
     * <li>Supported placeholder: {JobId}, which indicates the snapshot job ID.</li>
     * <li>Placeholders such as {UnixTimestamp}, {Sequence}, and {Date} are not allowed.</li>
     * <li>You must specify at least one of the file formats for overwrite snapshots and sequence snapshots.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>snapshot/{JobId}.jpg</p>
     */
    @NameInMap("OverwriteFormat")
    public String overwriteFormat;

    /**
     * <p>The file format for sequence snapshots.</p>
     * <ul>
     * <li>It cannot start with a forward slash (/) and currently supports only the .jpg extension.</li>
     * <li>The maximum length is 255 characters.</li>
     * <li>Supported placeholders: {JobId} (snapshot job ID), {Date} (snapshot date), {UnixTimestamp} (timestamp), and {Sequence} (sequence number). You must specify at least one of {UnixTimestamp} and {Sequence}.</li>
     * <li>You must specify at least one of the file formats for overwrite snapshots and sequence snapshots.</li>
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
     * <p>The template name. The maximum length is 128 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>template1</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The time interval between snapshots, in seconds. Valid values: 5 to 3600.</p>
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
