// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLiveSnapshotTemplateRequest extends TeaModel {
    /**
     * <p>The overwrite snapshot file format.</p>
     * <ul>
     * <li>The value cannot start with &quot;/&quot;. Only the .jpg suffix is supported.</li>
     * <li>Maximum length: 255.</li>
     * <li>Supported placeholder: {JobId}: snapshot task ID.</li>
     * <li>The placeholders {UnixTimestamp}, {Sequence}, and {Date} are not allowed.</li>
     * <li>At least one of the overwrite snapshot format or sequence snapshot format must be specified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>snapshot/{JobId}.jpg</p>
     */
    @NameInMap("OverwriteFormat")
    public String overwriteFormat;

    /**
     * <p>The sequence snapshot file format.</p>
     * <ul>
     * <li>The value cannot start with &quot;/&quot;. Only the .jpg suffix is supported.</li>
     * <li>Maximum length: 255.</li>
     * <li>Supported placeholders: {JobId}: snapshot task ID, {Date}: snapshot date, {UnixTimestamp}: timestamp, {Sequence}: serial number. At least one of {UnixTimestamp} or {Sequence} must be specified.</li>
     * <li>At least one of the overwrite snapshot format or sequence snapshot format must be specified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>snapshot/{JobId}/{UnixTimestamp}.jpg</p>
     */
    @NameInMap("SequenceFormat")
    public String sequenceFormat;

    /**
     * <p>The template name.</p>
     * <ul>
     * <li>Maximum length: 128.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Template 1</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The snapshot time interval. Unit: seconds.</p>
     * <ul>
     * <li>Valid values: 5 to 3600.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
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
