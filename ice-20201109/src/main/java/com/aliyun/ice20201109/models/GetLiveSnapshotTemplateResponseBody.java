// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveSnapshotTemplateResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("LastModified")
    public String lastModified;

    @NameInMap("OverwriteFormat")
    public String overwriteFormat;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SequenceFormat")
    public String sequenceFormat;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TimeInterval")
    public Integer timeInterval;

    @NameInMap("Type")
    public String type;

    public static GetLiveSnapshotTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLiveSnapshotTemplateResponseBody self = new GetLiveSnapshotTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLiveSnapshotTemplateResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetLiveSnapshotTemplateResponseBody setLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    public String getLastModified() {
        return this.lastModified;
    }

    public GetLiveSnapshotTemplateResponseBody setOverwriteFormat(String overwriteFormat) {
        this.overwriteFormat = overwriteFormat;
        return this;
    }
    public String getOverwriteFormat() {
        return this.overwriteFormat;
    }

    public GetLiveSnapshotTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLiveSnapshotTemplateResponseBody setSequenceFormat(String sequenceFormat) {
        this.sequenceFormat = sequenceFormat;
        return this;
    }
    public String getSequenceFormat() {
        return this.sequenceFormat;
    }

    public GetLiveSnapshotTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetLiveSnapshotTemplateResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetLiveSnapshotTemplateResponseBody setTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }
    public Integer getTimeInterval() {
        return this.timeInterval;
    }

    public GetLiveSnapshotTemplateResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
